/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rechner;

/**
 * Ausgabe
 *
 * @author markus
 */
public class Output implements IOutput {

    RechenoperatoionsFactory factory;

    public Output() {
        this.factory = new RechenoperatoionsFactory();
    }

    /**
     * Gibt das Ergebnis aus
     *
     * @param ergebnis Ergebnis
     */
    @Override
    public void ausfuehren(double ergebnis) {
        System.out.println("Ergebnis ist: " + ergebnis);
    }

    public void operatoren() {

        int listSize = this.factory.getOperatoren().size();

        for (int i = 0; i < listSize; i++) {
            String operator = this.factory.getOperatoren().get(i);

            System.out.print(operator);
            if (i != listSize - 1) {
                System.out.print(" ");
            }
            if (i == listSize - 1) {
                System.out.println("");

            }
        }

    }
}
