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
public class e11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio 11
        
//        Realizar un programa que pida dos números enteros positivos por teclado 
//        y muestre por pantalla el siguiente menú:

//        MENU

//            1. Sumar 
//            2. Restar 
//            3. Multiplicar 
//            4. Dividir 
//            5. Salir 
//            Elija opción:

//        El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y 
//        luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. 
//        Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa 
//        directamente, se debe mostrar el siguiente mensaje de confirmación: 
//        ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ 
//        se sale del programa, caso contrario se vuelve a mostrar el menú.


        
        int num1;
        int num2;
        int opcionMenu;
        String confirmacion;
        boolean continuar = true;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero entre 1 y 10");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro número entero entre 1 y 10");
        num2 = leer.nextInt();
        
        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
                
            opcionMenu = leer.nextInt();
            
            switch (opcionMenu) {
                case 1:
                    int suma = num1 + num2;
                    System.out.println("La suma es: " + suma);
                    break;
                case 2:
                    int resta = num1 - num2;
                    System.out.println("La resta es: " + resta);
                    break;
                case 3:
                    int multiplicacion = num1 * num2;
                    System.out.println("La multiplicación es: " + multiplicacion);
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("No se puede dividir entre cero");
                    } else {
                        int division = num1 / num2;
                        System.out.println("La división es: " + division);
                    }
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    confirmacion = leer.next();
                    if (confirmacion.equalsIgnoreCase("N")) {
                        continuar = true; // Sale del switch y continúa en el bucle do repitiendo el menu de opciones
                    } else {
                        System.out.println("Gracias por utilizar el programa, hasta la próxima.");
                       continuar = false; // Termina el bucle do
                    }
            }
        } while (continuar == true);
    }
}

