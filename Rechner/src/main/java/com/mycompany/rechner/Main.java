/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rechner;

/**
 *
 * @author markus
 */
public class Main
{

    /**
     * Main
     * @param args 
     */
    public static void main(String[] args)
    {
        Rechner rechner=new Rechner(new Eingabe(), new Output(),new RechenoperatoionsFactory());  
        rechner.rechnen();
    }
    
}
