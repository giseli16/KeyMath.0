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
import javax.swing.table.DefaultTableModel;

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
        Vector <Vector <Object>> polinomios = new Vector <Vector <Object>>();
        
        titulo.add("Polinomios agregados");
        
        for (int i = 0; i < listaPolinomios.size(); i++) {
            Vector <Object> Fila = new Vector<Object>();
            Fila.add(listaPolinomios.get(i));
            polinomios.add(Fila);
            
        }
        DefaultTableModel modelo = new javax.swing.table.DefaultTableModel(polinomios, titulo);
        this.establecerModeloJTable(modelo, tabla);
        
    }
    
        private void establecerModeloJTable(DefaultTableModel modelo, JTable tabla){
        tabla.setModel(modelo);
    }
    
}
