/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo;

/**
 *
 * @author Administrador
 */
public class ColasReal {
    
    public static class ColaR{
        private int max=1000;
        private int cola[] = new int[max];
        private int frente;
        private int fin;

        //Constructor
        public ColaR(){
            this.frente = 0;
            this.fin = 0;
        }
        
        //Es para insertar los numero
        public void AltaElemento(int num){
            if(fin == max){
                System.out.println("COLA LLENA \n");
                return; 
            }
            cola[fin++]=num;
            System.out.println("Numero Insertado\n");
        }

        //Es para eliminar algun elemento 
        public void BajaElemento(){
            System.out.println("ELIMINAR\n");
            if(frente == fin){
                System.out.println("LA COLA ESTA VACIA\n");
                return;
            }
            System.out.println("Eliminar numero: " + cola[frente++]);
        }

        //Se imprimen todo los numeros que ya estan en cola
        public void ImprimirCola(){
            int i = 0;

            System.out.println("Imprimir elementos de la cola");
            if(frente == fin){
                for(i=frente; i<fin; i++){
                    System.out.println("cola[+i+]="+" "+cola[i]);
                }
                System.out.println("Frente =" + frente);
                System.out.println("Final = " + fin);
                System.out.println("Maximo = " + max);
            }
        }
        
    }
}
   
   
   

