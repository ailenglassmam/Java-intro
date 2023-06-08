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
public class e3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio 3
        
        //Escribir un programa que pida una frase y la muestre toda en mayúsculas y después 
        //toda en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
        
        String frase;

        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        
        //lo paso a mayus
        System.out.println(frase.toUpperCase());
       //lo paso a minus
       System.out.println(frase.toLowerCase());
    }
    
}
