/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro.ejercicios;

/**
 *
 * @author PC
 */
public class e18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio 18
        
//        Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz.
//        La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
        
//inicio la matriz y le doy dimensión 4
        int[][] matriz = new int[4][4];
        
        //llamo a las funciones que harán las operaciones
        llenadoMatriz(matriz);
       matrizInicial(matriz);
       matrizTranspuesta(matriz);
       
    }
    
    public static void llenadoMatriz(int[][] matriz){
        // relleno la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 50 + 1);
            }
        }
    }
    
    public static void matrizInicial(int[][] matriz){

        System.out.println("La matriz inicial es: ");
        
        // imprimo matriz inicial        
       for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
           }
            System.out.println("");
       }
    }
    
        public static void matrizTranspuesta(int[][] matriz){

        System.out.println("La matriz transpuesta es: ");
        
        // imprimo matriz transpuesta       
       for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[j][i] + " ");
           }
            System.out.println("");
       }
    }
}
