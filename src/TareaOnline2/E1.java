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
public class E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            double pulgada = 2.54 , centimetros = 2.54 , medida ;
    int opcion ;
        
    Scanner teclado = new Scanner (System.in) ;
        
    System.out.println("ELIGE UNA DE LAS OPCIONES");
    System.out.println("1-De pulgadas a centímetros");
    System.out.println("2-De centímetros a pulgadas");
        
    opcion = teclado.nextInt();
    
   
    
    System.out.println("Introduce la medida");
    
    medida = teclado.nextDouble() ;
    
    
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
    

