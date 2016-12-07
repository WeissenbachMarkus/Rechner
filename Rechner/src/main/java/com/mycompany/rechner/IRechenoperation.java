/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rechner;
/**
 * Schnittstelle Rechenoperation
 * @author markus
 */
public interface IRechenoperation
{
   
    /**
     * Führt implementierte Operation aus und liefert ein 
     * Ergebnis zurück
     * @param eingabe erste Zahl
     * @param eingabe2 zweite Zahl
     * @return Ergebnis
     */
    double ausfuehren(double eingabe, double eingabe2);
}
