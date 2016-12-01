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
public class Complejo extends Real
{
    private double imaginario;

    public Complejo(double numero, double imaginario) {
        super(numero);
        this.imaginario = imaginario;
    }

    public double getImaginario() {
        return imaginario;
    }

    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }
    
    // Metodos
    public void conjugar()
    {
        this.imaginario = (-1) * this.getImaginario();
    }
    
    public double formaPolar()
    {
        return Math.atan(this.getReal() / this.getImaginario());
    }
    
    @Override
    public String toString() {
        if(this.getImaginario() < 0)
            return super.toString() + (int)getImaginario() + "i";
        else
            return super.toString() + "+" + (int)getImaginario() + "i";
    }
    
    
}
