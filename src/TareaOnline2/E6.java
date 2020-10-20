/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TareaOnline2;

import java.util.Scanner;

/**
 * Esta clase resuelve el siguiente ejercicio:
 * Ejercicio 6: Pida por teclado dos números. A continuación, ha de mostrar un 
 * menú con dos opciones, indicando que si introduce un 1 por teclado se realizará 
 * la suma de ambos números y si introduce un 2 se realizará la resta. Por último 
 * realizar la operación y mostrar el resultado por pantalla.
 * 
 * @author Maria Bellido Rueda
 * @version 1.0
 */
public class E6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    //Clase Scanner para recoger datos de entrada por teclado
         Scanner teclado = new Scanner (System.in) ;

    //Declaración de variables     
        int numUno , numDos , opcion, solucion ;
        
    //Salida en consola
        System.out.println("Introduce el primer número");
            numUno = teclado.nextInt() ; //Recogida y almacenaje de datos de la variable
     
        System.out.println("Introduce el segundo número");
            numDos = teclado.nextInt() ; //Recogida y almacenaje de datos de la variable


        System.out.println("Elige una opción");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
            opcion = teclado.nextInt(); ////Recogida y almacenaje de datos de la variable
            
        //Estructura condicional if-else
        
        if (opcion == 1) {
           solucion = numUno + numDos ;
           System.out.println("La suma de los dos números introducidos es " + solucion);
        }
        else {
            solucion = numUno - numDos ;
            System.out.println("La resta de los dos números introducidos es " + solucion);

        
    }
        

    }
    
}
