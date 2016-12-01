/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polinomios;

import java.util.ArrayList;

/**
 *
 * @author Weyler
 */
public class ListaSimple extends Lista{

    @Override
    public void insertaInicio(Object dato) {
        if(vacio()){
            inicio = ultimo= new Nodo (dato);
        }else{
            inicio = new Nodo(dato,inicio);
        }
    }
    

    @Override
    public void insertaFinal(Object dato) {
        if(vacio()){
            inicio = ultimo= new Nodo (dato);
        }else{
           Nodo temp = new Nodo(dato);
           ultimo.setSiguiente(temp);
           ultimo = temp;
        }
    }

    @Override
    public Object eliminaInicio() {
          Object eliminado;
        if(vacio()){
            eliminado = null;
        }else{
            eliminado= inicio.getDato();
            inicio = inicio.getSiguiente();
        }
   
        return eliminado;
    }

    @Override
    public Object eliminaFinal() {
       Nodo primero=inicio, nodof = ultimo;
       Object eliminado;
       if(vacio()){
           System.out.println("LA LISTA ESTA VACIA");
       }else{
       if(primero.getSiguiente()==null){
           primero=inicio;
       }else if(!vacio()){
            primero = inicio;
       while(primero.getSiguiente().getSiguiente() != null){
                primero=primero.getSiguiente();
               
            }
             primero.setSiguiente(null);
              eliminado = nodof.getDato();
             return eliminado;
       }
       }
    return null;
    }
    
    
    public Object get(int index){
        ArrayList lis = new ArrayList();
         Object dato=null;
        Nodo actual = inicio;
        while(actual != null){ 
          lis.add(actual.getDato());
            actual = actual.siguiente;
        }
        for (int i=0; i<lis.size();i++){
          if( i == index){
                dato = lis.get(i);
                }
        }
//        System.out.println("\n"+"EL ÍNDICE ELEGIDO ES: "+index);
        return dato;
    }
    public Object eliminarPosicion(int index){
     
       Object dato=get(index);
       Nodo actual = inicio;
       while(actual!=null){
           if(actual.getDato()==dato){
               actual.setDato(actual.siguiente.getDato());
               actual.siguiente=(actual.siguiente).siguiente;
           }
           actual=actual.siguiente;
       }
      return null;
    }
    public void insertaOrdenado(int dato){
        if(vacio()){
            insertaInicio(dato);
        }else{
            if(inicio==ultimo){//solo hay un nodo en la lista
                if(dato < (Integer) inicio.getDato()){
                    insertaInicio(dato);
                }else{
                    insertaFinal(dato);
                }
            }else{//la lista contiene más de un elemento
                Nodo antes = null, despues = inicio;
                while(despues!=null && dato>(Integer)despues.getDato()){
                    antes =  despues;
                    despues = despues.getSiguiente();
                }
                if(antes == null){
                    insertaInicio(dato);
                }else{
                    if(despues == null){
                        insertaFinal(dato);
                    }else{
                        Nodo nuevo = new Nodo(dato,despues);
                        antes.setSiguiente(nuevo);
                    }
                }
                
            }
        }
     
    }
//       public void insertaOrdenado(Alumnos alumno){
//            if(vacio()){
//            insertaInicio(alumno);
//        }else{
//            if(inicio==ultimo){//solo hay un nodo en la lista
//                if(alumno.getEdad() < ((Alumnos) inicio.getDato()).getEdad()){
//                    insertaInicio(alumno);
//                }else{
//                    insertaFinal(alumno);
//                }
//            }else{//la lista contiene más de un elemento
//                Nodo antes = null, despues = inicio;
//                while(despues!=null && alumno.getEdad()>((Alumnos)despues.getDato()).getEdad()){
//                    antes =  despues;
//                    despues = despues.getSiguiente();
//                }
//                if(antes == null){
//                    insertaInicio(alumno);
//                }else{
//                    if(despues == null){
//                        insertaFinal(alumno);
//                    }else{
//                        Nodo nuevo = new Nodo(alumno,despues);
//                        antes.setSiguiente(nuevo);
//                    }
//                }
//                
//            }
//            }
//           
//            
//        }
//        
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
//        Alumnos alumno = new Alumnos("Juan","Lopez",23); 
//        Alumnos alumno1 = new Alumnos("Pedro","Cacho",19); 
//        Alumnos alumno2 = new Alumnos("Juan","Magaña",54); 
//        Alumnos alumno3 = new Alumnos("MAria","Lopez",225);
//        Alumnos alumno4 = new Alumnos("BErnardo","Peña",23); 
//        
//        lista.insertaOrdenado(alumno);
//         lista.insertaOrdenado(alumno1);
//          lista.insertaOrdenado(alumno2);
//           lista.insertaOrdenado(alumno3);
//            lista.insertaOrdenado(alumno4);
//       
        
//        lista.insertaInicio("prro");
//        lista.insertaInicio(256.3);
//        lista.insertaInicio(35);
//        lista.insertaInicio('v');
//        lista.insertaFinal("casa");
//        lista.insertaFinal("pasa pack prro :v");
//        lista.eliminaInicio();
//        lista.eliminaFinal();
          lista.eliminarPosicion(2);
//        lista.insertaOrdenado(25);
//        lista.insertaOrdenado(98);
//        lista.insertaOrdenado(100);
//        lista.insertaOrdenado(0);
//        lista.insertaOrdenado(-2);
//        lista.insertaOrdenado(8);
//         lista.insertaOrdenado(3);
        
        
        lista.imprimir();
//         System.out.println("\n"+"Dato inicial eliminado: " + lista.eliminaInicio());
//        System.out.println("\nDato final eliminado: "+lista.eliminaFinal());
//         lista.imprimir();
//       
//        System.out.println("\n"+"EL INDICE ELEGIDO ES: "+lista.get(0));
    }
    
}
