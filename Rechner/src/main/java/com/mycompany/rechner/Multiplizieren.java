/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rechner;

/**
 * Definiert Rechenoperation zum multiplizieren.
 * @author markus
 */
public class Multiplizieren extends ARechenoperation
{

    public Multiplizieren()
    {
        super("*");
    }

    /**
     * Multipliziert
     * @param eingabe
     * @param eingabe2
     * @return 
     */
    @Override
    public double ausfuehren(double eingabe, double eingabe2)
    {
        return eingabe*eingabe2;
    }
    
}
