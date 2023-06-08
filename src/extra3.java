
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
public class extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
//        Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.

        Scanner leer = new Scanner(System.in);
                
                String letraIngresada;
                
                System.out.println("Ingrese una letra");
                letraIngresada = leer.next();
               
                if(letraIngresada.equals(String.valueOf('a')) || letraIngresada.equals(String.valueOf('e')) || letraIngresada.equals(String.valueOf('i')) || letraIngresada.equals(String.valueOf('o')) || letraIngresada.equals(String.valueOf('u'))){
                    System.out.println("La letra ingresada es vocal");
                } else {
                    System.out.println("La letra ingresada es consonante");
                }
    }
    
}
