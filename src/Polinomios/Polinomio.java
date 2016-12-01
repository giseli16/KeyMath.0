/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polinomios;
//import binomio.*;
import java.util.Scanner;
/**
 *
 * @author jorge.reyes
 */
public class Polinomio extends ListaD{

    @Override
    public void insertaInicio(Object dato) {
        if (vacio())
            inicio = ultimo = new NodoDoble(dato);
        else{
            NodoDoble nuevo =  new NodoDoble(dato,inicio,null);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
    }
//     public void insertaInicio(Termino termino) {
//        if (vacio())
//            inicio = ultimo = new NodoDoble((Object)termino);
//        else{
//            NodoDoble nuevo =  new NodoDoble((Object)termino,inicio,null);
//            inicio.setAnterior(nuevo);
//            inicio = nuevo;
//        }
//    }

    @Override
    public void insertaFinal(Object dato) {
        if (vacio())
            inicio = ultimo = new NodoDoble(dato);
        else
        {
            NodoDoble nuevo = new NodoDoble(dato,null,ultimo);
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
    }

    @Override
    public Object eliminaInicio() {
       Object eliminado = null;
       if (vacio())
            System.out.println("Lista vacía");
       else
       {
           eliminado = inicio.getDato();
           if (inicio==ultimo){
               inicio = ultimo = null;
           }
           else
           {
             inicio = inicio.siguiente;
             inicio.anterior = null;
           } 
       }
       return eliminado;
    }

    @Override
    public Object eliminaFinal() {
       Object eliminado = null; 
       if (vacio())
            System.out.println("Lista vacía.");
       else{
           eliminado = ultimo.getDato();
           if (inicio == ultimo)
               inicio = ultimo =null;
           else{
               ultimo = ultimo.anterior;
               ultimo.siguiente = null;
           }
       } 
       return eliminado;
    }
//    public void elevaBinomio(Termino termino1, Termino termino2){
//        int a,b,c,d,e,f,g;
//        ListaDoble listaAux = new ListaDoble();
//        if(vacio()){
//            System.out.println("No Hay Elemento En la lista");
//        }else{
//            
//           a = (int) Math.pow(termino1.getCoeficiente(),2);
//           b = termino1.getExponente()*2;
//           Termino terminoA = new Termino(a,b);
//            listaAux.insertaFinal((Object)terminoA);
//           c = (termino1.getCoeficiente()*termino2.getCoeficiente())*2;
//           d = termino1.getExponente()+termino2.getExponente();
//           Termino terminoB = new Termino(c,d);
//            listaAux.insertaFinal((Object)terminoB);
//           e = (int) Math.pow(termino2.getCoeficiente(), 2);
//           f= termino2.getExponente()*2;
//           Termino terminoC = new Termino(e,f);
//            listaAux.insertaFinal((Object)terminoC);
//            System.out.println("\nResultado: \n");
//            listaAux.imprimir();
//        }
//    }
    public void elevaBinomio(TerminoP termino1, TerminoP termino2){
        int a,b,c,d,e,f,g;
        Polinomio listaAux = new Polinomio();
        if(vacio()){
            System.out.println("No Hay Elemento En la lista");
        }else{
            
           a = (int) Math.pow(termino1.getCoeficiente(),2);
           b = (int) (termino1.getExponente()*2);
           TerminoP terminoA = new TerminoP(a,b);
            listaAux.insertaFinal((Object)terminoA);
           c = (int) ((termino1.getCoeficiente()*termino2.getCoeficiente())*2);
           d = (int) (termino1.getExponente()+termino2.getExponente());
           TerminoP terminoB = new TerminoP(c,d);
            listaAux.insertaFinal((Object)terminoB);
           e = (int) Math.pow(termino2.getCoeficiente(), 2);
           f= (int) (termino2.getExponente()*2);
           TerminoP terminoC = new TerminoP(e,f);
            listaAux.insertaFinal((Object)terminoC);
            System.out.println("\nResultado: \n");
            listaAux.imprimir();
        }
    }
    public void elevaPolinomio(){
        
    }
//    public void multiplicaBinomio(Termino termino1, Termino termino2, Termino termino3, Termino termino4){
//        int a,b,c,d,e,f,g,h;
//        ListaDoble listaAux = new ListaDoble();
//        if(vacio()){
//            System.out.println("No Hay Elementos En la Lista");
//        }else{
//           a = termino1.getCoeficiente()*termino3.getCoeficiente();
//           b = termino1.getExponente()+termino3.getExponente();
//           Termino terminoA = new Termino(a,b);
//           listaAux.insertaFinal((Object)terminoA);
//           c = termino2.getCoeficiente()*termino3.getCoeficiente();
//           d = termino2.getExponente()+termino3.getExponente();
//           Termino terminoB = new Termino(c,d);
//           listaAux.insertaFinal(terminoB);
//           e = termino1.getCoeficiente()*termino4.getCoeficiente();
//           f = termino1.getExponente()+termino4.getExponente();
//           Termino terminoC = new Termino(e,f);
//           listaAux.insertaFinal(terminoC);
//           g = termino2.getCoeficiente()*termino4.getCoeficiente();
//           h = termino2.getExponente()+termino4.getExponente();
//           Termino terminoD = new Termino (g,h);
//           listaAux.insertaFinal(terminoD);
//            System.out.println("\n Resultado: \n");
//            listaAux.imprimir();
//        }
//        
//    }
    public static void main(String[] args) {
        Polinomio listaD = new Polinomio();
        Polinomio listaD2 = new Polinomio();
       
        int op=0,C,e;
        String X;
        Scanner entrada = new Scanner(System.in);
//        Termino2 termino = new Termino2(3,"X",2);
//        Termino2 termino2 = new Termino2(4,"X",2);
//        listaD.insertaInicio(termino);
//        listaD.insertaInicio(termino2);
//        listaD.imprimir();
//        listaD.elevaBinomio(termino2, termino);
           while(op!=1){
               System.out.println("Inserte el Coeficiente");
               C = entrada.nextInt();
               System.out.println("Inserte la variable");
               X = entrada.next();
               System.out.println("Inserte el exponente");
               e = entrada.nextInt();
               TerminoP termino = new TerminoP(C,X,e);
               listaD.insertaFinal(termino);
               System.out.println("Desea ingresar otro Termino?");
               System.out.println("Op =1");
               op = entrada.nextInt();
          }
           listaD.imprimir();
    }
    
}
