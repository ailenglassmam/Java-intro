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
public class e2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio 2
        //Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
       
       String nombre;

        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresá tu nombre");
        nombre = leer.next();
         
        System.out.println("Bienvenida al Himalaya,  " + nombre + "!");
        
        // nextLine() toma toda la frase
        //next() toma la primer palabra de la frase
    }
    
}
