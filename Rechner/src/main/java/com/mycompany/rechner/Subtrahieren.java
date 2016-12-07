/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rechner;

/**
 * Definiert Rechenoperation zum subtrahieren.
 *
 * @author markus
 */
public class Subtrahieren extends ARechenoperation {

    public Subtrahieren() {
        super("-");
    }

    /**
     * Subtrahiert zwei Parameter.
     *
     * @param eingabe erste Zahl
     * @param eingabe2 zweite Zahl
     * @return Ergebnis
     */
    @Override
    public double ausfuehren(double eingabe, double eingabe2) {

        return eingabe - eingabe2;
    }

}
