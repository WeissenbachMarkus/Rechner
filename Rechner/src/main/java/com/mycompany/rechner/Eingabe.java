/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rechner;

import java.util.Scanner;

/**
 * Gibt das Ergebnis aus
 *
 * @author markus
 */
public class Eingabe implements IEingabe
{

    private Scanner scan;
    private double input1, input2;
    private String operator;

    public Eingabe()
    {
        this.scan = new Scanner(System.in);

    }

    /**
     * Abfrage
     */
    @Override
    public void abfrage()
    {

        System.out.println("Geben Sie eine Zahl ein:");
        this.input1 = EingabeUeberpruefung.doubleEingabe();
        System.out.println("Geben Sie einen Operator ein:");
        this.operator = EingabeUeberpruefung.operatorEingabe();
        System.out.println("Geben Sie eine Zahl ein:");
        this.input2 = EingabeUeberpruefung.doubleEingabe();

    }

    @Override
    public double getInput1()
    {
        return this.input1;
    }

    @Override
    public double getInput2()
    {
        return this.input2;
    }

    @Override
    public String getOperator()
    {
        return this.operator;
    }

}
