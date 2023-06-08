/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 2
        
//        Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. 
//        A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, 
//        A tome el valor de D y D tome el valor de B. Mostrar los valores iniciales y los valores finales de cada variable. 
//        Utilizar sólo una variable auxiliar.

        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        int auxiliar;
        
        System.out.println("Los valores iniciales de las variables A, B, C y D son: " + A + ", " + B + ", " + C + ", " + D + " respectivamente");
            
            auxiliar = A;
            A = D;
            D = B;
            B = C;
            C = auxiliar;
            
            
       System.out.println("Los valores finales de las variables A, B, C y D son: " + A + ", " + B + ", " + C + ", " + D + " respectivamente");
       
       
       
       
    }
    
}
