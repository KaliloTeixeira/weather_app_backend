/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.itware.cityweather.service;

import com.itware.cityweather.Cityweather;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.Stateless;
import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;

import org.glassfish.embeddable.GlassFishException;
import org.glassfish.embeddable.GlassFishProperties;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author kalil
 */
@Stateless
public class CityweatherFacadeRESTTest {
    
    private static Context  ctx;
    private static EJBContainer ejbContainer;
    
    public CityweatherFacadeRESTTest() {
    }
    
    @Ignore
    @BeforeClass
    public static void setUpClass() throws IOException, GlassFishException {
        ejbContainer = EJBContainer.createEJBContainer();
        System.out.println("Opening the container" );
        ctx = ejbContainer.getContext();
    }
    
    @Ignore
    @AfterClass
    public static void tearDownClass() {
        ejbContainer.close();
        System.out.println("Closing the container" );
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of edit method, of class CityweatherFacadeREST.
     */
    @Ignore
    @Test
    public void testEdit_GenericType() throws Exception {
        System.out.println("edit");
        Cityweather entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CityweatherFacadeREST instance = (CityweatherFacadeREST)container.getContext().lookup("java:global/classes/CityweatherFacadeREST");
        instance.edit(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class CityweatherFacadeREST.
     */
    @Ignore
    @Test
    public void testRemove_GenericType() throws Exception {
        System.out.println("remove");
        Cityweather entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CityweatherFacadeREST instance = (CityweatherFacadeREST)container.getContext().lookup("java:global/classes/CityweatherFacadeREST");
        instance.remove(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class CityweatherFacadeREST.
     */
    @Ignore
    @Test
    public void testFind_Object() throws Exception {
        System.out.println("find");
        Object id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CityweatherFacadeREST instance = (CityweatherFacadeREST)container.getContext().lookup("java:global/classes/CityweatherFacadeREST");
        Cityweather expResult = null;
        Cityweather result = instance.find(id);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class CityweatherFacadeREST.
     */
    @Ignore
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        Cityweather entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CityweatherFacadeREST instance = (CityweatherFacadeREST)container.getContext().lookup("java:global/classes/CityweatherFacadeREST");
        instance.create(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class CityweatherFacadeREST.
     */
    @Ignore
    @Test
    public void testEdit_Integer_Cityweather() throws Exception {
        System.out.println("edit");
        Integer id = null;
        Cityweather entity = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CityweatherFacadeREST instance = (CityweatherFacadeREST)container.getContext().lookup("java:global/classes/CityweatherFacadeREST");
        instance.edit(id, entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class CityweatherFacadeREST.
     */
    @Ignore
    @Test
    public void testRemove_Integer() throws Exception {
        System.out.println("remove");
        Integer id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CityweatherFacadeREST instance = (CityweatherFacadeREST)container.getContext().lookup("java:global/classes/CityweatherFacadeREST");
        instance.remove(id);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class CityweatherFacadeREST.
     */
    @Ignore
    @Test
    public void testFind_Integer() throws Exception {
        System.out.println("find");
        Integer id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CityweatherFacadeREST instance = (CityweatherFacadeREST)container.getContext().lookup("java:global/classes/CityweatherFacadeREST");
        Cityweather expResult = null;
        Cityweather result = instance.find(id);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class CityweatherFacadeREST.
     */
    @Ignore
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CityweatherFacadeREST instance = (CityweatherFacadeREST)container.getContext().lookup("java:global/classes/CityweatherFacadeREST");
        List<Cityweather> expResult = null;
        List<Cityweather> result = instance.findAll();
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateAllWeatherFromApi method, of class CityweatherFacadeREST.
     */
    @Ignore
    @Test
    public void testUpdateAllWeatherFromApi() throws Exception {
        System.out.println("updateAllWeatherFromApi");
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CityweatherFacadeREST instance = (CityweatherFacadeREST)container.getContext().lookup("java:global/classes/CityweatherFacadeREST");
        instance.updateAllWeatherFromApi();
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateWeatherFromApiByCityname method, of class CityweatherFacadeREST.
     */
    @Ignore
    @Test
    public void testUpdateWeatherFromApiByCityname() throws Exception {
        System.out.println("updateWeatherFromApiByCityname");
        Cityweather cityweather = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CityweatherFacadeREST instance = (CityweatherFacadeREST)container.getContext().lookup("java:global/classes/CityweatherFacadeREST");
        String expResult = "";
        String result = instance.updateWeatherFromApiByCityname(cityweather);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
