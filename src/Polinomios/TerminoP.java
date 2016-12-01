/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polinomios;

/**
 *
 * @author HP
 */
public class TerminoP {
    private double coeficiente;
    private String variable;
    private double exponente;

    public TerminoP() {
    }

    public TerminoP(double coeficiente, String variable, double exponente) {
        this.coeficiente = coeficiente;
        this.variable = variable;
        this.exponente = exponente;
    }

    TerminoP(int e, int f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(double coeficiente) {
        this.coeficiente = coeficiente;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public double getExponente() {
        return exponente;
    }

    public void setExponente(double exponente) {
        this.exponente = exponente;
    }

    @Override
    public String toString() {
        return "("+ getCoeficiente() +")" +"("+ getVariable()+")"+"^" + getExponente();
    }
    
    
}
