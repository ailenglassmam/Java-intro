
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 20
        
//        Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
//        suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
//        permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
//        El programa deberá comprobar que los números introducidos son correctos, es decir,
//        están entre el 1 y el 9.

        Scanner leer = new Scanner(System.in);
        
        int [][] matrizMagica = new int [3][3];
        
        llenadoMatriz(matrizMagica, leer);
        impresionMatriz(matrizMagica, leer);
        sumaValores(matrizMagica, leer);
        
    }
    
    private static void llenadoMatriz(int [][] matrizMagica, Scanner leer) {
        
        for (int[] matrizMagica1 : matrizMagica) {
            for (int j = 0; j < matrizMagica.length; j++) {
                int num;
                do {
                    System.out.println("Ingrese un número del 1 al 9");
                    num = leer.nextInt();
                    matrizMagica1[j] = num;
                    
                    if(num < 1 || num > 9 ) {
                        System.out.println("Valor incorrecto. Vuelva a intentarlo");
                    }
                } while (num < 1 || num > 9);
                
            }
        }
    }
    
        private static void impresionMatriz(int [][] matrizMagica, Scanner leer) {
        System.out.println("Matriz resultante: ");
        for (int i = 0; i < matrizMagica.length; i++) {
            for (int j = 0; j < matrizMagica.length; j++) {
                System.out.print(matrizMagica[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    
    private static void sumaValores(int [][] matrizMagica, Scanner leer){
    
        //suma filas
        int fila1 = matrizMagica[0][0] + matrizMagica[0][1] + matrizMagica[0][2];
        int fila2 = matrizMagica[1][0] + matrizMagica[1][1] + matrizMagica[1][2];
        int fila3 = matrizMagica[2][0] + matrizMagica[2][1] + matrizMagica[2][2];
        
        //suma columnas
        int columna1 = matrizMagica[0][0] + matrizMagica[1][0] + matrizMagica[2][0];
        int columna2 = matrizMagica[0][1] + matrizMagica[1][1] + matrizMagica[2][1];
        int columna3 = matrizMagica[0][2] + matrizMagica[1][2] + matrizMagica[2][2];
        
        //suma diagonales
        int diagonal1 = matrizMagica[0][0] + matrizMagica[1][1] + matrizMagica[2][2];
        int diagonal2 = matrizMagica[2][0] + matrizMagica[1][1] + matrizMagica[0][2];

        if(fila1 == fila2 && fila2 == fila3 && fila3 == columna1 && columna1 == columna2 && columna2 == columna3 && columna3 == diagonal1 && diagonal1 == diagonal2) {
            System.out.println("Felicitaciones, tu matriz es mágica");
        } else {
            System.out.println("Lo siento, tu matriz no es mágica");
        }
        
    }
}
