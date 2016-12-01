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
public class DequeListaSimple implements Deque{
    protected ListaSimple lista ;
    protected int cont;

    public DequeListaSimple() {
        lista = new ListaSimple();
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
        deque.insertFirst("hola");
        deque.insertLast(12334);
        deque.insertFirst(9.0);
        deque.insertFirst(false);
        while(!deque.isEmpty()){
            System.out.println(deque.removeFirst());
            System.out.println(deque.fist());
        }
    }
    
}
