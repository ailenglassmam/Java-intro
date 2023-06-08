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
public class e4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio 4
        
        //Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
        //grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
        
        double tempCelcius;
        double tempFar;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la temperatura en °C");
        tempCelcius = leer.nextDouble();
        
        tempFar = 32 + (9 * tempCelcius / 5);
        
        System.out.println("La temperatura en °F es de: " + tempFar);
    }
    
}
