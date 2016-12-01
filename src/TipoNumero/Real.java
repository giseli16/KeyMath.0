/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TipoNumero;

/**
 *
 * @author ricardo
 */
public class Real{
    
    //Aquí se van a poner las operaciones básicas para los números reales
    private double real;

    // Constructor
    public Real(double numero) {
        this.real = numero;
    }
    
    
    // Getters and Setters
    public double getReal() {
        return real;
    }
    
    public void setReal(double real) {
        this.real = real;
    }

    @Override
    public String toString() {
        return "" + getReal();
    }
}
