/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TareaOnline2;

import java.util.Scanner;

/**
 *
 * @author Maria Bellido Rueda
 * @version 1.0
 */
public class E5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        //Muestre los 10 siguientes números pares a partir de uno introducido por teclado. 
        //Por ejemplo, si el número introducido es el 13 ha de mostrar: 14, 16, 18, 20, 22, 24, 26, 28, 30, 32.
        
        Scanner teclado = new Scanner (System.in) ;
        
        int numero , i = 1;
        
        System.out.println("Introduce un número por teclado: ");        
            numero = teclado.nextInt() ;
        
            
        if (numero % 2 == 0) {
            for ( i = numero ; numero>=10 ; i+=2  ){
            System.out.println(i) ;
                  
        
    } //Esta actividad está sin terminar, me he quedado atrancada. Seguiré intentando
      //hacerla y la entrego en la siguiente.
    
}
}

}