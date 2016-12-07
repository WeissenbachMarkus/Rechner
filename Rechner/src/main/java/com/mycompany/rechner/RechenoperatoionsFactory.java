/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rechner;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Factory für Rechenoperationsobjekte
 *
 * @author markus
 */
public class RechenoperatoionsFactory {

    private ArrayList<ARechenoperation> rechenoperationen;

    public RechenoperatoionsFactory() {
        this.rechenoperationen = new ArrayList<>();
        rechenoperationen.add(new Addieren());
        rechenoperationen.add(new Subtrahieren());
        rechenoperationen.add(new Dividieren());
        rechenoperationen.add(new Multiplizieren());
    }

    public ARechenoperation liefereRechenoperation(String operator) throws Exception {
        for (ARechenoperation rechenoperation : this.rechenoperationen) {
            if (rechenoperation.getOperator().equals(operator)) {
                return rechenoperation;
            }
        }

        throw new Exception("Eingegebner Operant nicht verfügbar");
    }

    public ArrayList<ARechenoperation> getRechenoperationen() {
        return rechenoperationen;
    }

    public ArrayList<String> getOperatoren() {
        ArrayList<String> operatoren = new ArrayList<>();

        for (ARechenoperation rechenoperation : this.rechenoperationen) {

            operatoren.add(rechenoperation.getOperator());
        }
        return operatoren;
    }

}
