package com.itware.cityweather.service;

import com.itware.cityweather.Cityweather;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.json.Json;
import javax.json.JsonObject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author kalil
 */
@Stateless
@Path("cityweather")
public class CityweatherFacadeREST extends AbstractFacade<Cityweather> {

    @PersistenceContext(unitName = "com.itware_Cityweather_war_1.0PU")
    private EntityManager em;
    private static final Logger LOGGER = Logger.getLogger(CityweatherFacadeREST.class.getName());
    private static final String API_URL = "https://api.openweathermap.org/data/2.5/weather";
    private static final String API_KEY = "2b986aead4d3682a2eb8b8f8359831a7";

    Client client = ClientBuilder.newClient();

    public CityweatherFacadeREST() {
        super(Cityweather.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Cityweather entity) {
        String encodedCityName = encodeCityName(entity.getCityname());
        String url = buildApiUrl(encodedCityName);

        JsonObject jsonObject = getJsonObjectFromApi(url);
        double kelvinTemperature = jsonObject.getJsonObject("main").getJsonNumber("temp").doubleValue();
        entity.setTemperature(kelvinToCelsius(kelvinTemperature));
        entity.setTime(new Timestamp(new Date().getTime()));

        try {
            super.create(entity);
            LOGGER.log(Level.INFO, "Entity created successfully.");
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error creating entity: {0}", e.getMessage());
            throw new WebApplicationException(Response.status(Response.Status.BAD_REQUEST).entity("Error creating entity: " + e.getMessage()).build());
        }
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, Cityweather entity) {
        try {
            super.edit(entity);
            LOGGER.log(Level.INFO, "Entity edited successfully.");
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error editing entity: {0}", e.getMessage());
            throw new WebApplicationException(Response.status(Response.Status.BAD_REQUEST).entity("Error editing entity: " + e.getMessage()).build());
        }
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        try {
            super.remove(super.find(id));
            LOGGER.log(Level.INFO, "Entity removed successfully.");
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error removing entity: {0}", e.getMessage());
            throw new WebApplicationException(Response.status(Response.Status.BAD_REQUEST).entity("Error removing entity: " + e.getMessage()).build());
        }
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response find(@PathParam("id") Integer id) {
        try {
            Cityweather cityweather = super.find(id);
            if (cityweather == null) {
                LOGGER.log(Level.WARNING, "Entity not found with id: {0}", id);
                return Response.status(Response.Status.NOT_FOUND).entity("Cityweather with id " + id + " not found").build();
            }
            LOGGER.log(Level.INFO, "Entity found with id: {0}", id);
            return Response.ok(cityweather).build();
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error finding entity: {0}", e.getMessage());
            return Response.status(Response.Status.BAD_REQUEST).entity("Error finding entity: " + e.getMessage()).build();
        }
    }

    @GET
    @Override
    @Produces(MediaType.APPLICATION_JSON)
    public List<Cityweather> findAll() {
        System.out.println("Finding all Iniciated");
        try {
            LOGGER.log(Level.INFO, "Finding all entities.");
            return super.findAll();
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error finding all entities: {0}", e.getMessage());
            throw new WebApplicationException(Response.status(Response.Status.BAD_REQUEST).entity("Error finding all entities: " + e.getMessage()).build());
        }
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    @Schedule(minute = "*/1", hour = "*", persistent = false)
    public void updateAllWeatherFromApi() {
        System.out.println("UPDATING ALL ENTITIES");
        List<Cityweather> cityweatherList = findAll();

        for (Cityweather cityweather : cityweatherList) {
            System.out.println(cityweather);
            updateWeatherFromApiByCityname(cityweather);

        }
    }

    public String updateWeatherFromApiByCityname(Cityweather cityweather) {
        String encodedCityName = encodeCityName(cityweather.getCityname());
        String url = buildApiUrl(encodedCityName);

        Response response = client.target(url).request(MediaType.APPLICATION_JSON).get();
        String jsonResponse = response.readEntity(String.class);

        Cityweather newCityweatherData = cityweather;

        JsonObject jsonObject = Json.createReader(new StringReader(jsonResponse)).readObject();
        double kelvinTemperature = jsonObject.getJsonObject("main").getJsonNumber("temp").doubleValue();
        newCityweatherData.setTemperature(kelvinToCelsius(kelvinTemperature));
        newCityweatherData.setTime(new Timestamp(new Date().getTime()));

        edit(cityweather.getId(), newCityweatherData);

        response.close();
        return jsonResponse;
    }

    private String encodeCityName(String cityName) {
        String encodedCityName = "";
        try {
            encodedCityName = URLEncoder.encode(cityName, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(CityweatherFacadeREST.class.getName()).log(Level.SEVERE, null, ex);
        }
        return encodedCityName;
    }

    private double kelvinToCelsius(double temperature) {
        double celsius = temperature - 273.15;
        return (double) Math.round(celsius);
    }

    private String buildApiUrl(String encodedCityName) {
        return API_URL + "?q=" + encodedCityName + "&appid=" + API_KEY;
    }

    private JsonObject getJsonObjectFromApi(String url) {
        Response response = client.target(url).request(MediaType.APPLICATION_JSON).get();
        String jsonResponse = response.readEntity(String.class);
        response.close();
        client.close();
        return Json.createReader(new StringReader(jsonResponse)).readObject();
    }
}
