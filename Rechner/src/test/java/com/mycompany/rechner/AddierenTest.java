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
public class AddierenTest
{
    
    public AddierenTest()
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
     * Test of ausfuehren method, of class Addieren.
     */
    @Test
    public void testAusfuehren()
    {
        System.out.println("ausfuehren");
        double eingabe = 1.0;
        double eingabe2 = 2.0;
        Addieren instance = new Addieren();
        double expResult = 3.0;
        double result = instance.ausfuehren(eingabe, eingabe2);
        assertEquals(expResult, result, 0.0);
    }
    
}
