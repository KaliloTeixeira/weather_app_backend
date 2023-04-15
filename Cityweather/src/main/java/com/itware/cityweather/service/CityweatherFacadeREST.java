/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itware.cityweather.service;

import com.itware.cityweather.Cityweather;
import com.itware.cityweather.resources.WeatherAPI;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
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

    public CityweatherFacadeREST() {
        super(Cityweather.class);
    }

   @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Cityweather entity) {
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
        WeatherAPI.updateAllWeatherFromApi();
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
    
}
