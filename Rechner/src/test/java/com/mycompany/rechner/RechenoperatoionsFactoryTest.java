/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rechner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author markus
 */
public class RechenoperatoionsFactoryTest
{
    
    public RechenoperatoionsFactoryTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of liefereRechenoperation method, of class RechenoperatoionsFactory.
     */
    @Test
    public void testLiefereRechenoperation() throws Exception
    {
        System.out.println("liefereRechenoperation");
        String operator = "-";
        RechenoperatoionsFactory instance = new RechenoperatoionsFactory();
        ARechenoperation result = instance.liefereRechenoperation(operator);
        assertTrue(result instanceof Subtrahieren);
    }
    
    @Test
    public void testLiefereRechenoperation2() throws Exception
    {
        System.out.println("liefereRechenoperation");
        String operator = "+";
        RechenoperatoionsFactory instance = new RechenoperatoionsFactory();
        ARechenoperation result = instance.liefereRechenoperation(operator);
        assertFalse(result instanceof Subtrahieren);
    }
    
}
