/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TareaOnline2;

/**
 * Esta clase resuelve el siguiente ejercicio:
 * Ejercicio8: Muestre los primeros 50 números impares. Recuerda que has de usar algunas 
 * de las estructuras vistas en la unidad.
 * @author Maria Bellido Rueda
 * @version 1.0
 */
public class E8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        //Declaración de variable
            int i = 1 ;
        
        //Estructura de bucle for
            for (i=1 ; i <50 ; i+=2) { //Inicializamos i en uno, respetir bucle hasta 50, que en este caso                
                System.out.println(i); //va a llegar hasta 49 porque solo vamos a mostrar los impares, por 
                                       //último incrementar de dos en dos para que nos muestre solo impares. 
        }
    }
    
}
