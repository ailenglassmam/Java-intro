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
public class e7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio 7
//        Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá 
//        un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
//        Nota: investigar la función equals() en Java.

        String palabraIngresada;
        String palabraObjetivo;
        Boolean resultado;

        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresá una palabra");
        palabraIngresada = leer.next();
        
        palabraObjetivo = "eureka";
        
        //equalsIgnoreCase() ignora si la palabra ingresada está con mayuscula o minuscula
        resultado = palabraIngresada.equalsIgnoreCase(palabraObjetivo);
        
        if (resultado == true) {
             System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
        
    }
    
}
