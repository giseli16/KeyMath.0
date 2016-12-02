/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polinomios;



/**
 *
 * @author Weyler
 */
public class DequeListaDoble implements Deque{

   protected ListaDoble lista ;
    protected int cont;

    public DequeListaDoble() {
        lista = new ListaDoble();
    }
    
    

    @Override
    public int size() {
return cont;
    }

    @Override
    public boolean isEmpty() {
       return lista.vacio();
    }

    @Override
    public void insertFirst(Object o) {
        lista.insertaInicio(o);
        cont++;
    }

    @Override
    public void insertLast(Object o) {
       lista.insertaFinal(o);
       cont++;
    }

    @Override
    public Object removeFirst() {
       if(!lista.vacio()){
           cont--;
           return lista.eliminaInicio();
       }
       return null;
    }

    @Override
    public Object removeLast() {
        if(!lista.vacio()){
            cont--;
           return lista.eliminaFinal();
        }
       return null;
    }

    @Override
    public Object fist() {
        
        if(!lista.vacio())
           return lista.getInicio().getDato();
       return null;
    }

    @Override
    public Object last() {
      if(!lista.vacio())
           return lista.getUltimo().getDato();
       return null;
    }


    
    
    
    public static void main(String[] args) {
        DequeListaSimple deque = new DequeListaSimple();
        DequeListaSimple deque2 = new DequeListaSimple();
        TerminoP termino1 = new TerminoP(3,"x",2);
        TerminoP termino2 = new TerminoP(4,"x",2);
        TerminoP termino3 = new TerminoP(2,"x",2);
        TerminoP termino4 = new TerminoP(5,"x",2);
        
        deque2.insertFirst(termino1);
        deque.insertFirst(termino2);
        deque.insertFirst(termino3);
        deque.insertFirst(termino4);
        while(!deque.isEmpty()){
            System.out.print(deque.removeFirst()+"+");
            
        }
    }
    
}
