/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.itware.cityweather.service;

import com.itware.cityweather.Cityweather;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.Stateless;
import javax.ejb.embeddable.EJBContainer;
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
//@Stateless
public class CityweatherFacadeRESTTest {

    public CityweatherFacadeRESTTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    
    @Before
    public void setUp() {
        //Map properties = new HashMap();
        //properties.put(EJBContainer.PROVIDER, "org.glassfish.ejb.embedded.glassfish.instance.root");
        //EJBContainer ejbC = EJBContainer.createEJBContainer(properties);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of edit method, of class CityweatherFacadeREST.
     */
    @Ignore
    @Test
    public void testEdit() throws Exception {
        // Create a new Cityweather entity
   //     Cityweather entity = new Cityweather();
     //   entity.setId(1);
       // entity.setCityname("New York");
      //  entity.setTemperature(25.0);
       // entity.setTime(new Timestamp(new Date().getTime()));

        // Persist the entity using the create method
//        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
  //      CityweatherFacadeREST instance = (CityweatherFacadeREST) container.getContext().lookup("java:global/classes/CityweatherFacadeREST");
    //    instance.create(entity);

        // Verify that the entity was persisted
      //  Cityweather persistedEntity = instance.find(entity.getId());
        assertNotNull(1);

        // Update the entity using the edit method
  //      entity.setTemperature(30.0);
    //    instance.edit(entity);

        // Verify that the entity was updated
  //      Cityweather updatedEntity = instance.find(entity.getId());
    //    assertEquals(30.0, updatedEntity.getTemperature(), 0.01);

        // Remove the entity using the remove method
      //  instance.remove(entity);

        // Verify that the entity was removed
        //Cityweather removedEntity = instance.find(entity.getId());
     //   assertNull(removedEntity);

        // Clean up the test data
       // container.close();
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
        CityweatherFacadeREST instance = (CityweatherFacadeREST) container.getContext().lookup("java:global/classes/CityweatherFacadeREST");
        instance.remove(entity);
        container.close();
        // TODO review the generated test code and remove the default call to fail.

        assertNull(null);

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
        CityweatherFacadeREST instance = (CityweatherFacadeREST) container.getContext().lookup("java:global/classes/CityweatherFacadeREST");
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
        CityweatherFacadeREST instance = (CityweatherFacadeREST) container.getContext().lookup("java:global/classes/CityweatherFacadeREST");
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
        CityweatherFacadeREST instance = (CityweatherFacadeREST) container.getContext().lookup("java:global/classes/CityweatherFacadeREST");
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
        CityweatherFacadeREST instance = (CityweatherFacadeREST) container.getContext().lookup("java:global/classes/CityweatherFacadeREST");
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
        CityweatherFacadeREST instance = (CityweatherFacadeREST) container.getContext().lookup("java:global/classes/CityweatherFacadeREST");
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
        CityweatherFacadeREST instance = (CityweatherFacadeREST) container.getContext().lookup("java:global/classes/CityweatherFacadeREST");
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
        CityweatherFacadeREST instance = (CityweatherFacadeREST) container.getContext().lookup("java:global/classes/CityweatherFacadeREST");
        instance.updateAllWeatherFromApi();
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateWeatherFromApiByCityname method, of class
     * CityweatherFacadeREST.
     */
    @Ignore
    @Test
    public void testUpdateWeatherFromApiByCityname() throws Exception {
        System.out.println("updateWeatherFromApiByCityname");
        Cityweather cityweather = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CityweatherFacadeREST instance = (CityweatherFacadeREST) container.getContext().lookup("java:global/classes/CityweatherFacadeREST");
        String expResult = "";
        String result = instance.updateWeatherFromApiByCityname(cityweather);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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

}
