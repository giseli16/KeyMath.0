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
public class ListaDoble extends ListaD {

    @Override
    public void insertaInicio(Object dato) {
    if(vacio()){
        setInicio(ultimo = new NodoDoble(dato));
    }else{
        NodoDoble nuevo = new NodoDoble(dato, getInicio(),null);
        getInicio().setAnterior(nuevo);
        setInicio(nuevo);
    }
    }

    @Override
    public void insertaFinal(Object dato) {
        if(vacio()){
            setInicio(ultimo= new NodoDoble (dato));
        }else{
           NodoDoble temp = new NodoDoble (dato,null, getUltimo());
           getUltimo().setSiguiente(temp);
           setUltimo(temp);
        }
    }

    @Override
    public Object eliminaInicio() {
         Object eliminado;
        if(vacio()){
            eliminado = null;
        }else{
            
            eliminado= getInicio().getDato();
            if(getInicio()==getUltimo()){
            setInicio(ultimo =  null);
            }else{
                setInicio(getInicio().getSiguiente());
                inicio.anterior=null;
            }
        }
   
        return eliminado;
    }
    

    @Override
    public Object eliminaFinal() {
        NodoDoble primero=getInicio(), nodof = getUltimo();
       Object eliminado=null;
       if(vacio()){
           System.out.println("LA LISTA ESTA VACIA");
       }else{
       if(primero.getSiguiente()==null){
           primero=getInicio();
       }else if(!vacio()){
            primero = getInicio();
       while(primero.getSiguiente().getSiguiente() != null){
                primero=primero.getSiguiente();
               
            }
          
              setUltimo(nodof.getAnterior());
              eliminado = nodof.getDato();
              ultimo.siguiente=null;
            
             
              
             return eliminado;
       }
       }
    return null;
    }
//    public Object eliminaPosicion(){
//        Object eliminado=null;
//        if(vacio()){
//            System.out.println("La lista esta vacia");
//        }
//        else{
//            
//        }
//        return eliminado;
//    }
    
    
    public static void main(String[] args) {
        ListaDoble listaD = new ListaDoble();
        listaD.insertaInicio("perro");
        listaD.insertaInicio(3.14);
        listaD.insertaInicio("Hola");
        listaD.insertaFinal("pescado");
        System.out.println("imprimiendo la lista...");
        listaD.imprimir();
        System.out.println("\n *Se eliminó el primer elemento: " + listaD.eliminaInicio());
        listaD.imprimir();
        System.out.println("\n *Se eliminó el último elemento: " + listaD.eliminaFinal());
        listaD.imprimir();
        System.out.println("\n imprimiendo al revés...");
        listaD.imprimirAlRevés();
    }
  
}

