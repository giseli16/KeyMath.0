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
public interface Deque {
    public int size();
    public boolean isEmpty();
    public void insertFirst(Object o);
    public void insertLast(Object o);
    public Object removeFirst();
    public Object removeLast();
    public Object fist();
    public Object last();
    
}
