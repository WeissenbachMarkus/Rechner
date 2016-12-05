/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rechner;

/**
 *
 * @author markus
 */
public abstract class ARechenoperation implements IRechenoperation
{

    String operator;

    public ARechenoperation(String operator)
    {
        this.operator = operator;
    }
    
    @Override
    public abstract double ausfuehren(double eingabe, double eingabe2);

    public String getOperator()
    {
        return operator;
    }


}
