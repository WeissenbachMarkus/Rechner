/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rechner;

/**
 * Definiert Rechenoperation zum addieren.
 * @author markus
 */
public class Addieren extends ARechenoperation
{

    public Addieren()
    {
        super("+");
    }
    /**
     * Addiert zwei Parameter.
     * @param eingabe erste Zahl
     * @param eingabe2 zweite Zahl
     * @return Ergebnis
     */
    @Override
    public double ausfuehren(double eingabe, double eingabe2)
    {
        return eingabe + eingabe2;
    }
    
}
