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
public class E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            int numUno , numDos, resultado ;
    
    Scanner teclado = new Scanner (System.in) ;
    
    System.out.println("Introduzca el primer número con el que operar:");
        numUno = teclado.nextInt();
    
    System.out.println("Introduzca el segundo número con el que operar:");
        numDos = teclado.nextInt();
    
    resultado = (numUno + numDos) ;
    
        System.out.println("La suma de los dos números es " + resultado);
    
    resultado = (numUno - numDos) ;
    
        System.out.println("La resta de los dos números es " + resultado);
        
    resultado = (numUno * numDos) ;
    
        System.out.println("La multiplicación de los dos números es " + resultado);
    
    resultado = (numUno / numDos) ;
    
        System.out.println("La división de los dos números es " + resultado);


    }
    
}
