/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teclado;
import Polinomios.*;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;

/**
 *
 * @author giselle
 */
public class TablaPolinomios {
    public ArrayList listaPolinomios= new ArrayList();
    
    public TablaPolinomios(ArrayList listaPolinomios){
        this.listaPolinomios= listaPolinomios;
    }
    
    public void InicializarTabla(JTable tabla){
        Vector <String> titulo = new Vector<String>();
        Vector <Vector<Object>> polinomios = new Vector <Vector <Object>>();
        
        titulo.add("Polinomios agregados");
        
        for (int i = 0; i < listaPolinomios.size(); i++) {
            
        }
        
    }
    
}
