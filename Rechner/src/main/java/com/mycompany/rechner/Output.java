/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rechner;

/**
 * Ausgabe
 * @author markus
 */
public class Output implements IOutput
{

    /**
     * Gibt das Ergebnis aus
     * @param ergebnis  Ergebnis
     */
    @Override
    public void ausfuehren(double ergebnis)
    {
        System.out.println("Ergebnis ist: "+ergebnis);
    }
    
}
