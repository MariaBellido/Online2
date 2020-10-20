/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TareaOnline2;

import java.util.Scanner;

/**
 * Esta clase resuelve el siguiente ejercicio:
 * Ejercicio 2: Pida dos números por teclado. Ha de mostrar la suma, resta, multiplicación y división de ambos números.
 * @author Maria Bellido Rueda
 * @version 1.0
 */
public class E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    //Clase Scanner para recoger datos de entrada por teclado
        Scanner teclado = new Scanner (System.in) ;

    //Declaración de variables
        int numUno , numDos, resultado ;
    
    //Salida en consola   

        System.out.println("Introduzca el primer número con el que operar:");
            numUno = teclado.nextInt();
    
        System.out.println("Introduzca el segundo número con el que operar:");
            numDos = teclado.nextInt();
            
    //Operaciones aritméticas y salida de datos
    
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
