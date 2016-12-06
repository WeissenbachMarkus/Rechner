/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rechner;

/**
 * Schnittstelle Eingabe
 * @author markus
 */
public interface IEingabe
{
    void abfrage();
    double getInput1();
    double getInput2();
    String getOperator();
}
