
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
public class extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       Una obra social tiene tres clases de socios:
//            o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
//            o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
//            o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
//            o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo 
//        del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.

        Scanner leer = new Scanner(System.in);

        String tipoSocio;
        int tratamiento;
        int descuento;

        System.out.println("Ingrese su categoría de socio (A, B o C)");
        tipoSocio = leer.next();

        switch (tipoSocio) {
            case "A":
                System.out.println("Ingrese el valor del tratatamiento a realizar");
                tratamiento = leer.nextInt();
                descuento = 50 * tratamiento / 100;
                System.out.println("El monto a pagar es de: $" + descuento);
                break;
            case "B":
                System.out.println("Ingrese el valor del tratatamiento a realizar");
                tratamiento = leer.nextInt();
                descuento = tratamiento - (35 * tratamiento / 100);
                System.out.println("El monto a pagar es de: $" + descuento);
                break;
            case "C":
                System.out.println("Ingrese el valor del tratatamiento a realizar");
                tratamiento = leer.nextInt();
                System.out.println("El monto a pagar es de: $" + tratamiento);
                break;

        }
    }

}
