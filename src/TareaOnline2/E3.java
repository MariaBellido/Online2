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
public class E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                
        int numero , contador ;
        
        Scanner teclado = new Scanner (System.in) ;
        
        System.out.println("Introduzca un número para mostrar los negativos");
        
        numero = teclado.nextInt();
        
        numero = -(numero) ;
        
        for (contador = 1 ; contador <= 100 ; contador --) {
            System.out.println(contador);
        }

    }
    
}
