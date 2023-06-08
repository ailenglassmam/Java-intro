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
public class e13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio 13
//        Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 

        Scanner leer = new Scanner(System.in);
        
        int medidaDibujo;
        int fila;
        int columna;
        
         System.out.println("Ingresá el tamaño del cuadrado a dibujar");
            medidaDibujo = leer.nextInt();
            
            for(fila = 1; fila <= medidaDibujo; fila++){
                 for(columna = 1; columna <= medidaDibujo; columna++){
                     if(fila == 1 || fila == medidaDibujo || columna == 1 || columna == medidaDibujo){
                         System.out.print('*' + " "); 
                     } else {
                         System.out.print("  "); 
                     }
                 }
                 System.out.println();  
            }
    }
    
}
