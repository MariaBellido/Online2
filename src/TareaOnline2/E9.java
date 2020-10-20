/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TareaOnline2;

import java.util.Scanner;

/**
 * Esta clase resuelve el siguiente ejercicio:
 * Ejercicio 9: Se introduzca un número entero por teclado e indique si es par o impar.
 * 
 * @author Maria Bellido Rueda
 * @version 1.0
 */
public class E9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Clase Scanner para recoger datos de entrada por teclado     
            Scanner teclado = new Scanner (System.in) ;

        
        //Declaración de variable
            int numero ;
        
        //Salida en consola
            System.out.println("Introduzca un número para comprobar si es par o impar");        
                numero = teclado.nextInt() ; //Recogida y almacenamiento de datos variable
                
        //Estructura condicional if-else        
            if (numero % 2 == 0) { //Si el módulo de 2 es 0, al dividir un número para entre dos, su resto es 0.
                System.out.println("El número introducido es par");
        }
            else {
                System.out.println("El número introducido es impar");
        }
        
}
    }

    
     
    

        