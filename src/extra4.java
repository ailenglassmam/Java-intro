
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
public class extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano
        
        Scanner leer = new Scanner(System.in);
        
        int numero;
        String numRomano = null;
        
        System.out.println("Ingrese un número entre el 1 y el 10");
        numero = leer.nextInt();
        
        if(numero <= 3) {
            numRomano = "";
            for(int i = 1; i <= numero; i++){
                numRomano = numRomano + "I";
            }
            System.out.println("El número " + numero + " equivale a " + numRomano + " en número romano");
        } else if(numero == 4){
            numRomano = "IV";
            System.out.println("El número " + numero + " equivale a " + numRomano + " en número romano");
        } else if(numero == 5){
            numRomano = "V";
            System.out.println("El número " + numero + " equivale a " + numRomano + " en número romano");
        } else if(numero <= 8) {
            numRomano = "V";
            for(int i = 6; i <= numero; i++){
                numRomano = numRomano + "I";
            }
            System.out.println("El número " + numero + " equivale a " + numRomano + " en número romano");
        }else if(numero == 9){
            numRomano = "IX";
            System.out.println("El número " + numero + " equivale a " + numRomano + " en número romano");
        }else if(numero == 10){
            numRomano = "X";
            System.out.println("El número " + numero + " equivale a " + numRomano + " en número romano");
        } else {
            System.out.println("El número ingresado no es válido.");
        }
    }
    
}
