/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TareaOnline2;

import java.util.Scanner;

/**
 * Esta clase resuelve el siguiente ejercicio:
 * Ejercicio 1: Enseñe un menú donde se elija una de las siguientes opciones: pulgadas a centímetros 
 * y de centimetros a pulgadas. 
 * Para ello, el programa solicitará que se seleccione la opción y preguntará 
 * al usuario que introduzca el número de pulgadas (o centimetros, según el caso) y a continuación mostrará 
 * cuantos centímetros son ( o pulgadas). (Nota: 1 pulgada son 2,54 cm).
 * 
 * 
 * @author Maria Bellido Rueda
 * @version 1.0
 */
public class E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    //Clase Scanner para recoger datos de entrada por teclado
    
        Scanner teclado = new Scanner (System.in) ;
 

    //Declaración de variables
            
        double pulgada = 2.54 , centimetros = 2.54 , medida ; //Variable flotante para recoger dedimales
        int opcion ; //Variable entera que va a recoger la instrucción que elige el usuario
        
    //Salida en consola   
        System.out.println("ELIGE UNA DE LAS OPCIONES");
        System.out.println("1-De pulgadas a centímetros");
        System.out.println("2-De centímetros a pulgadas");
            opcion = teclado.nextInt(); //Recogida y guardado de la variable opcion
    
   
        System.out.println("Introduce la medida");
            medida = teclado.nextDouble() ; //Recogida y guardado de la variable media, tipo double porque es número real
    
    //Estructura condicional if
        if (opcion == 2)    {
          medida /= pulgada ;
          System.out.println("Son " + medida + " pulgadas");
        
    } 
         else {
            medida *= centimetros ;
            System.out.println("Son " + medida + " centimetros");
    }
    }

    }
    

