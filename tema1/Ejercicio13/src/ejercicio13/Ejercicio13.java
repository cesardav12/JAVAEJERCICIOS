package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese un valor");
        int valor1 = entrada.nextInt();
        System.out.println("ingrese otro valor");
        int valor2 = entrada.nextInt();
        if (valor1>=valor2) {
            System.out.println("el numero mayor es: " + valor1 + " el menor es: " + valor2);
        } else {
            System.out.println("el numero mayor es: " + valor2 + " el menor es: " + valor1);
        }
    }
}
