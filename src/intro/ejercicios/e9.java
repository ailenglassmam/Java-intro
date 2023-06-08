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
public class e9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio 9
//        Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. 
//        Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
//        en caso contrario, se deberá imprimir “INCORRECTO”. 
//        Nota: investigar la función Substring y equals() de Java

        String frase;
        String primeraLetra;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresá una frase");
        frase = leer.nextLine();
        
        //substring() es igual a subcadena() en PSeint. Hay que indicar los index de la letra a buscar
        primeraLetra = frase.substring(0, 1);
        
//        Se convierte la variable 'a' (de tipo char) a una cadena utilizando String.valueOf() para realizar la comparación correctamente
//          Tira error por la incompatibilidad de los tipos de datos
        if(primeraLetra.equalsIgnoreCase(String.valueOf('a'))) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
    
}
