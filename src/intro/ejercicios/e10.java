/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro.ejercicios;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class e10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio 10
        
        //Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
        //números al usuario hasta que la suma de los números introducidos supere el límite inicial.
        
         int numLimite;
         int numSumar;
         int resultadoSuma = 0;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 1 número límite positivo (1 - 10)");
        numLimite = leer.nextInt();
        
for (int i = 0; i < numLimite; i++) {
            System.out.println("Ingrese un número entero positivo para realizar la suma:");
            numSumar = leer.nextInt();

            resultadoSuma += numSumar;
        }
        
        System.out.println("La suma total de los números ingresados es de: " + resultadoSuma);

    }
    
}
