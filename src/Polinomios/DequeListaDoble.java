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
    public void multiplicaBinomio(DequeListaDoble deque, DequeListaDoble deque2){
        DequeListaDoble dequeAux = new DequeListaDoble();
        DequeListaDoble deque3 = new DequeListaDoble();
        
        int a,b,c,d,e,h,veces=deque.size();
        String f,g;
        
        TerminoP termino1 = new TerminoP();
        TerminoP termino2 = new TerminoP();
        TerminoP terminoAux = new TerminoP();
        
        while(!deque2.isEmpty()){
            System.out.println("holo");
            
            termino1 = (TerminoP)deque.fist();
            a=(int) termino1.getCoeficiente();
            b=(int) termino1.getExponente();
            f=termino1.getVariable(); 
            
            for (int i = 0; i < veces; i++) {
                    if(f.equals(((TerminoP)deque2.fist()).getVariable())){
                        c=a*(int)((TerminoP)deque2.fist()).getCoeficiente();
                        d=b+(int)((TerminoP)deque2.fist()).getExponente();
                        terminoAux.setCoeficiente(c);terminoAux.setExponente(d);terminoAux.setVariable(f);
                        dequeAux.insertFirst(terminoAux);
                    }
            }
           deque2.removeFirst();
        }
        while(!dequeAux.isEmpty()){
            System.out.println(dequeAux.removeFirst()+"+");
        }
         
    }
    public void sumaPolinomios(DequeListaDoble deque, DequeListaDoble deque2){
        DequeListaDoble dequeAux = new DequeListaDoble();
        TerminoP termino1 = new TerminoP();
        TerminoP termino2 = new TerminoP();
          int a,b,c,d,e,h;
        String f,g;
       while(!deque.isEmpty()){
           termino1 = (TerminoP)deque.fist();
            a=(int) termino1.getCoeficiente();
            b=(int) termino1.getExponente();
            f=termino1.getVariable();           
            while(!deque2.isEmpty()){
                System.out.println("holi");
                termino2 = (TerminoP)deque2.fist();
                c = (int) termino2.getCoeficiente();
                d = (int) termino2.getExponente();
                g=termino2.getVariable();
                
            }
       }
        
    }
    public static void main(String[] args) {
        DequeListaDoble deque = new DequeListaDoble();
        DequeListaDoble deque2 = new DequeListaDoble();
        TerminoP termino1 = new TerminoP(3,"x",2);
        TerminoP termino2 = new TerminoP(5,"x",2);
        TerminoP termino3 = new TerminoP(2,"x",2);
//        TerminoP termino4 = new TerminoP(5,"x",2);
//        TerminoP termino5 = new TerminoP(6,"x",2);
        
        
        deque.insertFirst(termino1);
        deque.insertFirst(termino2);
//        deque.insertFirst(termino4);
        deque2.insertLast(termino3);
//        deque2.insertLast(termino5);
      deque.multiplicaBinomio(deque, deque2);
//        while(!deque2.isEmpty()){
//            System.out.print(deque2.removeFirst()+"+");
//            
//        }
    }
    
}
