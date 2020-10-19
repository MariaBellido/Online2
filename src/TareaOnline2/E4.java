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
public class E4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero ;
        
        Scanner teclado = new Scanner (System.in) ;

        System.out.println("Introduzca un número para comprobar si es positivo") ;
        
        numero = teclado.nextInt();
        
        if ( numero >= 0 ) {
            System.out.println("El número introducido es positivo");
        }
        
        else {
            System.out.println ("No es positivo") ;
        }
           
    }
    
}
