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
public class e12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio 12
        
//        Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
//        este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben 
//        llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, 
//        el primer carácter tiene que ser X y el último tiene que ser una O.
        
        int lecturasCorrectas = 0;
        int lecturasIncorrectas = 0;
        String serialUsuario;
        char primeraLetra = 'X';
        char ultimaLetra = 'O';

        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Ingresá el serial");
            serialUsuario = leer.next();
            
            if(serialUsuario.equals("&&&&&")){
                System.out.println("Fin del envío");
                break;
            }
            
            if(serialUsuario.length() == 5 && serialUsuario.charAt(0) == primeraLetra && serialUsuario.charAt(4) == ultimaLetra){
                lecturasCorrectas++;
            } else {
                lecturasIncorrectas++;
            }
        } while (true);
         
         System.out.println("INFORME FINAL DE LECTURAS");
         System.out.println("");
         System.out.println("Lecturas correctas: " + lecturasCorrectas);
         System.out.println("Lecturas incorrectas: " + lecturasIncorrectas);

    }
    
}
