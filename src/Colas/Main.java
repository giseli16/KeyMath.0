/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas;
import Colas.ColasReal.ColaR;
import java.util.Scanner;


/**
 *
 * @author Administrador
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entradaInt = new Scanner(System.in);
        ColaR colita = new ColaR();
        int opcion=0;
        
        do{
            System.out.println("\nCOLAS PARA NUMEROS REALES\n");
            System.out.println("\n*******MENU*******\n");
            System.out.println("1.-Dar de Alta a un Elemento\n");
            System.out.println("2.- Dar de Baja a un Elemento\n");
            System.out.println("3.- Imprimir la cola\n");
            System.out.println("Escoja una opcion: ");
            opcion = entradaInt.nextInt();
            
            switch(opcion){
                case 1: AltaElemento();
                        break;
                case 2: colita.BajaElemento();
                        break;
                case 3: colita.ImprimirCola();
                        break;
            }
        }
        while (opcion !=0 );
    }
    
    public static void AltaElemento(){
        int numero = 0;
        Scanner entradaInt = new Scanner(System.in);
        
        System.out.println("Dar de ALTA\n");
        System.out.print("Ingrese el numero: ");
        numero = entradaInt.nextInt();
        //colita.AltaElemento(numero);
    }

    
}
