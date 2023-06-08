
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
public class fati {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
               opciones();
    }
    
    public static void opciones(){
       int num1;
       int num2;
    
      Scanner numeros = new Scanner(System.in);
        
        System.out.println("ingrese 2 numeros para operar");
       
        num1 = numeros.nextInt();
        num2 = numeros.nextInt();      
        String confirmacion;
        boolean continuar = true;
        int opcion;
        
        System.out.println("Seleccione 1 SUMA, 2 RESTA, 3 MULTIPLICAR, 4 DIVIDIR, O 5 SALIR");
        opcion = numeros.nextInt();
       
        do{
            
            //El menú tiene que estar dentro del DO para que itere cada vez que da la vuelta
            
        switch(opcion){
         
            case 1:
                int suma = num1 + num2;
                System.out.println("la suma de los numeros es " + suma);
               break;
            case 2:
                int resta = num1 - num2;
                System.out.println("la resta de los numeros es " + resta);
                break;
            case 3:
                int multiplicar = num1 * num2;
                System.out.println("el producto de los numeros es " + multiplicar);
                break;
            case 4:
                double division = num1 / num2;
                System.out.println("la division de los numeros da " + division);
                break;
            case 5:
                System.out.println("¿Esta seguro que desea salir? S/N");
                confirmacion = numeros.next();
                if(confirmacion.equalsIgnoreCase("N")){
                    continuar = true;
                }else{
                   System.out.println("Gracias por todo. hasta luego");
                   continuar = false;
                }
        }
        }while (continuar == true);
    }
    
}
