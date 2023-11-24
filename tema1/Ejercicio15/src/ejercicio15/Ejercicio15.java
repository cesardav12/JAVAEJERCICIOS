package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un valor");
        int valor1 = entrada.nextInt();
        System.out.println("Ingrese otro valor");
        int valor2 = entrada.nextInt();
        System.out.println("Ingrese otro otro valor");
        int valor3 = entrada.nextInt();
        if (valor1 > valor2) {
            if (valor1 > valor3) {
                System.out.println("MAYOR: " + valor1);
            } else {
                System.out.println("MAYOR: " + valor2);
            }
        } else {
            if (valor2 > valor3) {
                System.out.println("MAYOR: " + valor2);
            } else {
                System.out.println("MAYOR: " + valor3);
            }
        }
    }

}
