/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rechner;

import java.util.Scanner;

/**
 *
 * @author markus
 */
public class EingabeUeberpruefung
{

    private static Scanner scan = new Scanner(System.in);

    public static int intEingabe()
    {

        while (!scan.hasNextInt())
        {
            scan.next();
            System.out.println("Nur Ganzzahlen möglich!");
        }
        return scan.nextInt();

    }

    public static double doubleEingabe()
    {

        while (!scan.hasNextDouble())
        {
            scan.next();
            System.out.println("Nur Gleitkommazahlen möglich!");
        }
        return scan.nextDouble();

    }

    public static String operatorEingabe()
    {
        boolean istOperator = false;
        String operator = "";
        RechenoperatoionsFactory factory = new RechenoperatoionsFactory();

        while (!istOperator)
        {
            operator = scan.next();
            for (ARechenoperation operation : factory.getRechenoperationen())
            {
                if (operator.equals(operation.getOperator()))
                {
                    istOperator = true;
                }
            }
            if (!istOperator)
            {
                System.out.println("Nur Operatoren möglich!");
            }
        }
        return operator;

    }

}
