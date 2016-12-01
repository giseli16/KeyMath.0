/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polinomios;

/**
 *

 */
public abstract class ListaD extends Lista {
    protected NodoDoble inicio;
    protected NodoDoble ultimo;
    
    public boolean vacio(){
        return inicio == null;
    }
    
    public void imprimir(){
        NodoDoble actual = inicio;
        while(actual != null){
            if(actual==ultimo){
                System.out.println(actual.getDato());
                  actual = actual.getSiguiente();
                  }
            else{
               System.out.print(actual.getDato() + " + ");
            actual = actual.getSiguiente(); 
            }
//            System.out.print(actual.getDato() + " + ");
//            actual = actual.getSiguiente(); 
        }
    }
    
    public void imprimirAlRevés(){
    NodoDoble actual = ultimo;
        while(actual != null){
            System.out.print(actual.getDato() + " - ");
            actual = actual.getAnterior();
        }
    }

    /**
     * @return the inicio
     */
    public NodoDoble getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(NodoDoble inicio) {
        this.inicio = inicio;
    }

    /**
     * @return the ultimo
     */
    public NodoDoble getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(NodoDoble ultimo) {
        this.ultimo = ultimo;
    }
    
    
}
