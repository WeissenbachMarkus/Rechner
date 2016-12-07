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
public class EingabeUeberpruefung implements IEingabeUeberpruefung {

    RechenoperatoionsFactory factory;
    private Scanner scan;

    public EingabeUeberpruefung() {
        this.factory = new RechenoperatoionsFactory();
        this.scan = new Scanner(System.in);
    }

    public double doubleEingabe() {

        while (!scan.hasNextDouble()) {
            scan.next();
            System.out.println("Nur Gleitkommazahlen möglich!");
        }
        return scan.nextDouble();

    }

    public String operatorEingabe() {
        boolean istOperator = false;
        String operator = "";

        while (!istOperator) {
            operator = scan.next();
            for (String factoryOperator : factory.getOperatoren()) {
                if (operator.equals(factoryOperator)) {
                    istOperator = true;
                }
            }
            if (!istOperator) {
                System.out.println("Nur Operatoren möglich!");
                new Output().operatoren();
            }
        }
        return operator;

    }

}
