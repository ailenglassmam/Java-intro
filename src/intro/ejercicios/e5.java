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
public class e5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio 5
        
        //Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, 
        //el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
        
        int num;
        int doble;
        int triple;
        double raizC;
        
        System.out.println("Ingrese un número entero");
        
         Scanner leer = new Scanner(System.in);
         
         num = leer.nextInt();
         
         doble = num * 2;
          triple = num * 3;
          raizC = Math.sqrt(num);
          
          System.out.println("El doble del número ingresado es: " + doble);
          System.out.println("El triple del número ingresado es: " + triple);
          System.out.println("La raíz cuadrada del número ingresado es: " + raizC);
         
    }
    
}
