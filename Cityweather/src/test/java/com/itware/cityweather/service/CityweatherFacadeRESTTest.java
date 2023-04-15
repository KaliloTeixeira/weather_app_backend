/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.itware.cityweather.service;

import com.itware.cityweather.Cityweather;
import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import javax.ws.rs.core.Response;
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
    @Test
    @Ignore
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
    @Test
    @Ignore
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
    @Test
    @Ignore
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
    @Test
    @Ignore
    public void testFind_Integer() throws Exception {
        System.out.println("find");
        Integer id = null;
        EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
        CityweatherFacadeREST instance = (CityweatherFacadeREST)container.getContext().lookup("java:global/classes/CityweatherFacadeREST");
        Response expResult = null;
        Response result = instance.find(id);
        assertEquals(expResult, result);
        container.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class CityweatherFacadeREST.
     */
    @Test
    @Ignore
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
    
}
