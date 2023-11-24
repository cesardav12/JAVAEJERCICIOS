package ejercicio11t2;

import java.util.Scanner;

public class Ejercicio11T2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean seguir = true;
        int min = 1;
        int max = 100;
        int analizado = 0;
        String respuesta;
        System.out.println("Piensa en un número del 1 al 100.");
        while (seguir==true) {
            System.out.println("quieres seguir?");
                int num = (max + min) / 2;
                System.out.println("El numero que has pensado es menor, igual o mayor que " + num + "?");
                respuesta = entrada.nextLine();
                switch (respuesta){
                    case "igual":
                        seguir = false;
                        break;
                    case "mayor":
                        min = num;
                        analizado = num;
                        break;
                    case "menor":
                        max = num;
                        analizado = num;
                        break;
                    default:
                        System.out.println("Ingrese correctamente el texto");
                        break;
            }
        }    
        System.out.println("acerte madafaka");
    }
}
