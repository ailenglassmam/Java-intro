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
public class e14 {

    public static void main(String[] args) {
//      Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida 
//      por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La función tendrá como 
//      parámetros, la cantidad de euros y la moneda a converir que será una cadena, este no 
//      devolverá ningún valor y mostrará un mensaje indicando el cambio (void).

        Scanner leer = new Scanner(System.in);

        double valorInicial;

        System.out.println("Ingresá la cantidad de dinero en euros a convertir");
        valorInicial = leer.nextDouble();
        
        conversor(valorInicial);
    }
    
    public static void conversor(double valorInicial) {
                Scanner leer = new Scanner(System.in);        
                int opcionMenu;
                double conversion;
                
            System.out.println("¿A qué moneda desea realizar la conversión?");
            System.out.println("1. Dolar");
            System.out.println("2. Yen");
            System.out.println("3. Libra");
                
            opcionMenu = leer.nextInt();
            
            switch(opcionMenu) {
                case 1:
                    conversion = valorInicial * 1.28611;
                    System.out.println("El monto ingresado equivale a: USD$ " + conversion);
                    break;
                case 2: 
                    conversion = valorInicial * 129.852;
                    System.out.println("El monto ingresado equivale a: ¥" + conversion);
                    break;
                    case 3: 
                    conversion = valorInicial * 0.86;
                    System.out.println("El monto ingresado equivale a: £" + conversion);
                    break;
                    default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
    
}
}