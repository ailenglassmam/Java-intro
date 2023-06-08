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
public class e6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio 6
//        Crear un programa que dado un numero determine si es par o impar.

        int num;
        String resultado;
           
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 1 número entero de 2 dígitos como máximo");
        num = leer.nextInt();
        
        if (num % 2 == 0) {
        resultado = "par";
        } else {
            resultado = "impar";
        }
         
        System.out.println("El numero ingresado es: " + resultado);
    }
    
}
