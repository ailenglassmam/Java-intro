/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro.ejercicios;
import java.util.Scanner;

public class e1 {

    public static void main(String[] args) {
        
        //Ejercicio 1
        //Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
        //El programa deberá después mostrar el resultado de la suma
        
        int a;
        int b;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 1 número entero entre 1 y 10");
        a = leer.nextInt();
        
        System.out.println("Ingrese otro número entero entre 1 y 10");
        b = leer.nextInt();
         
        System.out.println(a + b);
    }
}
