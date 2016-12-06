/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rechner;


import java.util.ArrayList;


/**
 * Factory für Rechenoperationsobjekte
 * @author markus
 */
public class RechenoperatoionsFactory
{

    private ArrayList<ARechenoperation> rechenoperationen;

    public RechenoperatoionsFactory()
    {
        this.rechenoperationen = new ArrayList<>();
        rechenoperationen.add(new Addieren());
        rechenoperationen.add(new Subtrahieren());
        rechenoperationen.add(new Dividieren());
        rechenoperationen.add(new Multiplizieren());
    }

    public ARechenoperation liefereRechenoperation(String operator) throws Exception
    {
       for (ARechenoperation rechenoperation : this.rechenoperationen)
        {
            if (rechenoperation.getOperator().equals(operator))
            {
                return rechenoperation;
            }
        }
        
       throw new Exception("Eingegebner Operant nicht verfügbar");
    }
}
