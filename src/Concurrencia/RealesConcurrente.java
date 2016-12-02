/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Concurrencia;

import Aritmetica.OperacionesBasicas;
import TipoNumero.Real;
import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author ricardo
 */
public class RealesConcurrente implements Runnable
{
    private String signo;
    private ArrayList<Real> numeros;
    private JTextField resultado;

    public RealesConcurrente(String signo, ArrayList<Real> numeros, JTextField resultado) {
        this.signo = signo;
        this.numeros = numeros;
        this.resultado = resultado;
    }

    @Override
    public void run() {
        
        OperacionesBasicas opera = new OperacionesBasicas();
        
        Real actual = new Real(0);
        Real siguiente = new Real(0);
        
        for(int i = 0; i < numeros.size(); i++)
        {
            if(i == 0)
                actual = numeros.get(i);
            
            if(numeros.size() - 1 > i)
            {
                siguiente = numeros.get(i + 1);
            }
            
            if(numeros.size() - 1 > i)
            {
                if(signo.equals("+"))
                {
                    actual = opera.suma(actual, siguiente);
                }
                if(signo.equals("-"))
                {
                    actual = opera.resta(actual, siguiente);
                }
                if(signo.equals("*"))
                {
                    actual = opera.multiplicacion(actual, siguiente);
                }
                if(signo.equals("/"))
                {
                    actual = opera.division(actual, siguiente);
                }
            }
            
        }
        
        this.resultado.setText(actual.toString());
    }
    
}
