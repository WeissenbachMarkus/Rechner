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
public class MultiplizierenTest
{
    
    public MultiplizierenTest()
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
     * Test of ausfuehren method, of class Multiplizieren.
     */
    @Test
    public void testAusfuehren()
    {
        System.out.println("ausfuehren");
        double eingabe = 4.0;
        double eingabe2 = 3.0;
        Multiplizieren instance = new Multiplizieren();
        double expResult = 12.0;
        double result = instance.ausfuehren(eingabe, eingabe2);
        assertEquals(expResult, result, 0.0);     
    }
    
}
