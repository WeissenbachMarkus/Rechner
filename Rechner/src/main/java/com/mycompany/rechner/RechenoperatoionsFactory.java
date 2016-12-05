/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rechner;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;

/**
 *
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
    }

    public ARechenoperation liefereRechenoperation(String operataor)
    {
        for (ARechenoperation rechenoperation : this.rechenoperationen)
        {
            if (rechenoperation.getOperator().equals(operataor))
            {
                return rechenoperation;
            }
        }
       throw new IllegalArgumentException("Eingegebner Operant nicht verfügbar");
    }
}
