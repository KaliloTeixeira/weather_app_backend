package com.itware.cityweather.resources;

import com.itware.cityweather.Cityweather;
import com.itware.cityweather.service.AbstractFacade;
import com.itware.cityweather.service.CityweatherFacadeREST;
import java.io.StringReader;
import java.util.Iterator;
import java.util.List;
import javax.ejb.EJB;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author kalilo goncalves
 */
public class WeatherAPI {
    private static final String API_URL = "https://api.openweathermap.org/data/2.5/weather";
    private static final String API_KEY = "2b986aead4d3682a2eb8b8f8359831a7";
    
    @EJB
    private static CityweatherFacadeREST controller;


    public static String getWeatherFromApi(Cityweather cityweather) {
        String url = API_URL + "?q=" + cityweather.getCityname() + "&appid=" + API_KEY;
        Client client = ClientBuilder.newClient();
        
        System.out.println("kalilog02");

        Response response = client.target(url).request(MediaType.APPLICATION_JSON).get();
        String jsonResponse = response.readEntity(String.class);

        Cityweather newCityweatherData = new Cityweather();
        
        JsonObject jsonObject = Json.createReader(new StringReader(jsonResponse)).readObject();
        newCityweatherData.setTemperature(jsonObject.getJsonObject("main").getJsonNumber("temp").doubleValue());
        
        System.out.println("kalilog03");
        
        controller.edit(newCityweatherData);
        
        System.out.println(newCityweatherData);
        
        response.close();
        client.close();

        return jsonResponse;
    }
    
    public static void updateAllWeatherFromApi(){

        List<Cityweather> cityweatherList = controller.findAll();
        System.out.println("kalilog01");

        for (Cityweather cityweather : cityweatherList)
            getWeatherFromApi(cityweather);
    }
    
}
