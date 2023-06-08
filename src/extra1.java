
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
public class extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Extra 1
        
//        Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, 
//        si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.

        Scanner leer = new Scanner(System.in);
        
        int minutos;
        int horasTotales;
        int horasRestantes;
        int dias;
        
        System.out.println("Ingrese los minutos que desea calcular");
        minutos = leer.nextInt();
        horasTotales = Math. round(minutos / 60);
        dias = Math. round(horasTotales / 24);
        horasRestantes = horasTotales % 24;

            System.out.println("Los minutos ingresados equivalen a: " + dias + " día/s y " + horasRestantes + " hora/s.");
        
    }
    
}
