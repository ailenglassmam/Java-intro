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
public class e16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio 16
        
//        Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida 
//        al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra 
//       el numero y si se encuentra repetido
        Scanner leer = new Scanner(System.in);       
        
        int n;
        int numeroBuscado;
        
        System.out.println("Ingrese un numero entero positivo");
        n = leer.nextInt();
        
        int[] vector;
        
        vector = new int[n];
        // relleno el vector        
       for(int i = 0; i < n; i++){
           vector[i] = (int) (Math.random() * 50 + 1);
       }
       //lo muestro en pantalla para corroborar que funciones
       for(int i = 0; i <= n - 1; i++){
           System.out.print("[" + vector[i] + "]");
        }
       System.out.println();
       
        //pido el número a buscar
        System.out.println("Ingrese un numero que desee buscar");
        numeroBuscado = leer.nextInt();
        
        //defino una variable lógica para evaluar si imprimo o no un mensaje como resultado de la busqueda
        boolean encontrado = false;
        //pongo un contador por si se repite
        int contador = 0;
        
        for (int i = 0; i < n; i++) {
            if (vector[i] == numeroBuscado) {
                contador++;
                encontrado = true;
                if (encontrado == true) {
                    System.out.println("El número " + numeroBuscado + " se encuentra en la posición " + i);
                }
            }
        }
        
        if (encontrado == false) {
            System.out.println("El número buscado no se encuentra en el vector.");
        } else {
            if (contador > 1) {
                System.out.println("El número buscado se encuentra repetido " + contador + " veces en el vector.");
            }
        }
    }
}
