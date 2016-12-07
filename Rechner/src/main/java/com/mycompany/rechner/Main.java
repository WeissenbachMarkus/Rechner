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
     * @param args parameter
     */
    public static void main(String[] args)
    {
        Rechner rechner=new Rechner(new Eingabe(new EingabeUeberpruefung()), new Output(),new RechenoperatoionsFactory());  
        try
        {
            rechner.rechnen();
        } catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    
}
