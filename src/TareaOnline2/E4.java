/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TareaOnline2;

import java.util.Scanner;

/**
 * Esta clase resuelve el siguiente ejercicio:
 * Ejercicio 4: Comprueba si un número introducido por teclado es positivo. 
 * En caso afirmativo muestra el mensaje “El número introducido es positivo”.
 * 
 * @author Maria Bellido Rueda
 * @version 1.0
 */
public class E4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    //Clase Scanner para recoger datos de entrada por teclado    
        Scanner teclado = new Scanner (System.in) ;

    //Declaración de variables        
        int numero ;
        
    //Salida en consola
        System.out.println("Introduzca un número para comprobar si es positivo. Recuerda que el 0 no tiene signo.") ;        
            numero = teclado.nextInt(); //Recogida y almacenaje datos variable numero
            
    //Estructura condicional if
        
        if ( numero > 0 ) { //Si el número introducido es mayor a 0
            System.out.println("El número introducido es positivo"); //Salida
        }
        
        else { //Si no es mayor a 0
            System.out.println ("No es positivo") ; //Salida
        }
           
    }
    
}
