/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TareaOnline2;

import java.util.Scanner;

/**
 * Esta clase resuelve el siguiente ejercicio:
 * Ejercicio 7: Realice la división del número 100 entre uno introducido por el usuario y 
 * muestre el resultado.    
 * Posteriormente debe realizar la división del resultado obtenido entre otro número que 
 * introduzca el usuario y así sucesivamente hasta que este introduzca un 0 que finalizará el programa. 
 * Hay que tener en cuenta dos cosas: Se desea que el resultado que se muestre por pantalla y 
 * el que se almacene en la variable sea lo más exacto posible, por lo que has de elegir el dato 
 * más preciso posible.
 * La división por 0 no se debe realizar ya que dará como resultado una “indeterminación”. Utiliza la 
 * estructura más idónea para que esto no suceda.
 * 
 * @author Maria Bellido Rueda
 * @version 1.0
 */
public class E7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        // TODO code application logic here
        
        //Clase Scanner para recoger datos de entrada por teclado
            Scanner teclado = new Scanner(System.in) ; 
        
        //Declaración e inicialización de variables
            double numUs , resultado = 100 ;     
        
        
        //Estructura de bucle do-while
             do { 
               System.out.println("Introduce un número para utilizarlo de divisor de "+resultado) ;
                numUs = teclado.nextDouble() ;  


                resultado /= numUs ;
                System.out.println("El resultado es : " + resultado);
                
        }
             while (numUs >0 || resultado !=0) ;
        
    if (resultado == 0) {
        System.out.println("No se puede realizar la operación");
    }
        
        }

    }
    //Este ejercicio no he podido hacerlo correctamente, llevo días dandole vueltas
    //he utilizado distintas estructuras y operaciones y no hay forma.
