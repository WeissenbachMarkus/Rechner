/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rechner;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Kompositionsklasse Eingabe, Rechneoperation, Ausgabe
 *
 * @author markus
 */
public class Rechner
{

    private IEingabe eingabe;
    private IOutput output;
    private RechenoperatoionsFactory factory;

    public Rechner(IEingabe eingabe, IOutput output, RechenoperatoionsFactory factory)
    {
        this.eingabe = eingabe;
        this.output = output;
        this.factory = factory;
    }

    /**
     * führt Eingabe, zuständige Rechenoperation und Ausgabe zusammen
     * @throws java.lang.Exception Fehler ungültige Eingabe
     */
    public void rechnen() throws Exception
    {
        this.eingabe.abfrage();
        ARechenoperation rechenoperation = this.factory.liefereRechenoperation(eingabe.getOperator());
        double ergebnis = rechenoperation.ausfuehren(eingabe.getInput1(), eingabe.getInput2());
        this.output.ausfuehren(ergebnis);
    }

}
