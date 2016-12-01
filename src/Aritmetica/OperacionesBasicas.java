/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aritmetica;

import TipoNumero.*;

/**
 *
 * @author ricardo
 */
public class OperacionesBasicas implements Operaciones
{
    // Metodos Implementados de la interfaz
    @Override
    public double suma(double a, double b) 
    {
        return a + b;
    }

    @Override
    public double resta(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplicacion(double a, double b) 
    {
        return a * b;
    }

    @Override
    public double division(double a, double b) 
    {
        return a / b;
    }

    @Override
    public double exponente(double a, double b)
    {
        return Math.pow(a, b);
    }

    @Override
    public double raiz(double a, int b)
    {
        return Math.pow( a , (1 / b));
    }
    
    
    
    // Metodos Sobrecargados
    // Sumas - Completo
    public Real suma(Real a, Real b)
    {
        double real = ((Real)a).getReal() + ((Real)b).getReal();
        return new Real(real);
    }
    
    public Complejo suma(Complejo a, Complejo b)
    { 
        double real = a.getReal() + b.getReal();
        double imaginario = a.getImaginario() + b.getImaginario();
            
        return new Complejo(real, imaginario);
    }
    
    public Complejo suma(Real a, Complejo b)
    {
        double real =  a.getReal() + b.getReal();
        double complejo = b.getImaginario();
        
        return new Complejo(real, complejo);
    }
    
    public Complejo suma(Complejo a, Real b)
    {
        double real =  a.getReal() + b.getReal();
        double complejo = a.getImaginario();
        
        return new Complejo(real, complejo);
    }
    
    
    
    // Restas
    public Real resta(Real a, Real b)
    {
        double real = a.getReal() - b.getReal();
        return new Real(real);
    }
    
    public Complejo resta(Complejo a, Complejo b)
    {
        double real = a.getReal() - b.getReal();
        double imaginario = a.getImaginario() - b.getImaginario();
            
        return new Complejo(real, imaginario);
    }
    
    public Complejo resta(Real a, Complejo b)
    {
        double real = a.getReal() - b.getReal();
        // (b - d) pero b = 0, porque a es real
        // entonces solo queda ( - d)
        // se multiplica por -1 para modificar el signo solamente
        double imaginario = (-1) * b.getImaginario();
            
        return new Complejo(real, imaginario);
    }
    
    public Complejo resta(Complejo a, Real b)
    {
        // ya existia resta de real - complejo
        // solamente se invirtio el orden para hacer la misma operacion
        return resta(b, a);
    }
    
    // Multiplicaciones - Completo
    public Real multiplicacion(Real a, Real b)
    {
        double real = ((Real)a).getReal() * ((Real)b).getReal();
        return new Real(real);
    }
    
    // Formula de multiplicacion complejos
    // (a + bi) * (c + di) = (ac - bd) + (ad + bc)i
    public Complejo multiplicacion(Complejo a, Complejo b)
    {
        double real = (a.getReal() * b.getReal()) - (a.getImaginario() * b.getImaginario());
        double imaginario = (a.getReal() * b.getImaginario()) + ( a.getImaginario() * b.getReal() );
            
        return new Complejo(real, imaginario);
    }
    
    public Complejo multiplicacion(Real a, Complejo b)
    {
        // solamente se multiplica la parte real
        // (ac - bd) pero bd = 0 porque b= 0
        double real = a.getReal() * b.getReal();
            
        // (ad + bc)i
        // se anula bc porque b=0
        double imaginario = a.getReal() * b.getImaginario();
        
        return new Complejo(real, imaginario);
    }
    
    public Complejo multiplicacion(Complejo a, Real b)
    {
        // (ac - bd)
        // bd = 0 porque d = 0
        double real = a.getReal() * b.getReal();
            
        // (ad + bc)i
        // ad = 0 porque d = 0
        double imaginario = a.getImaginario() * b.getReal();
            
        return new Complejo(real, imaginario);
    }
    
    
    // Divisiones - Completo
    public Real division(Real a, Real b)
    {
        double real = a.getReal() / b.getReal();
        return new Real(real);
    }
    
    public Complejo division(Complejo a, Complejo b)
    {
        double Rnumerador = (a.getReal() * b.getReal()) + ( a.getImaginario() * b.getImaginario());
        double denominador = ( Math.pow( b.getReal(), 2 ) + Math.pow(b.getImaginario(), 2));
        
        double ParteReal = Rnumerador / denominador;
        
        double imgNumerador = (( a.getImaginario() * b.getReal()) - ( a.getReal() * b.getImaginario()) );
        
        double parteImg = imgNumerador / denominador;
        
        return new Complejo(ParteReal, parteImg);
    }
    
    public Complejo division(Real a, Complejo b)
    {
        // ( ac + bd ).... pero bd = 0, porque b = 0
        double Rnumerador = a.getReal() * b.getReal();
        // ( bc - ad )... pero bc = 0, porque b = 0
        double imgNumerador = a.getReal() * b.getImaginario();
        
        // ( c² + d² )
        double denominador = b.getReal() + b.getImaginario();
        
        double parteReal = Rnumerador / denominador;
        double parteImaginaria = imgNumerador / denominador;
        
        return new Complejo(parteReal, parteImaginaria);
    }
    
    public Complejo division(Complejo a, Real b)
    {
        // como ya se ha creado el metodo anteriormente
        // solamente se vuelve a llamar y se pasan los valores
        // en orden diferente
        return division(b, a);
    }
    
    
    // Exponentes
    public Real exponente(Real a, Real b)
    {
        double real = Math.pow(a.getReal(), b.getReal());
        return new Real(real);
    }
    
    
    
    
    // Raices
    public Real raiz(Real a, Real b)
    {
        double real = Math.pow(a.getReal(), 1 / b.getReal());
        return new Real(real);
    }
    
    public Real raiz(Real a, int b)
    {
        double real = Math.pow(a.getReal(), 1 / b);
        return new Real(real);
    }
}
