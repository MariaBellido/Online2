/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TareaOnline2;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class E6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**Pida por teclado dos números. A continuación, ha de mostrar un menú con dos opciones, 
         * indicando que si introduce un 1 por teclado se realizará la suma de ambos números y si 
         * introduce un 2 se realizará la resta. Por último realizar la operación y mostrar el 
         * resultado por pantalla.
         */
     
     int numUno , numDos ;
        
     Scanner teclado = new Scanner (System.in) ;

     
     System.out.println("Introduce el primer número");
        numUno = teclado.nextInt() ;
     
     System.out.println("Introduce el segundo número");
        numDos = teclado.nextInt() ;


     System.out.println("Elige una opción");
     
     System.out.println("1. Suma");

     System.out.println("2. Resta");

    }
    
}
