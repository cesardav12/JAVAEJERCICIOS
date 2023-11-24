package ejercicio7t2;

import java.util.Scanner;

public class Ejercicio7T2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 1;
        int negativos = 0;
        int positivos = 0;
        while (contador<=10) {
            System.out.println("Introduce el numero" + contador + "/10");
            int num = entrada.nextInt();
            if (num < 0) {
                negativos--;
            } else {
                positivos++;
            }
            contador++;
        }
        System.out.println("El numero total de negativos es: " + negativos + " el numero total de positivos es: " + positivos);
    }
}