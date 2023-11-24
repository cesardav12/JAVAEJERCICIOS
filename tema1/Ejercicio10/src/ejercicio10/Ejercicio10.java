package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un valor");
        int valor1 = entrada.nextInt();
        System.out.println("Ingrese otro valor");
        int valor2 = entrada.nextInt();
        int suma = (valor1 + valor2);
        int resta = (valor1 - valor2);
        int producto = (valor1 * valor2);
        System.out.println("suma=" + suma + " resta=" + resta + " producto=" + producto);
        if (valor2 == 0) {
            System.out.println("la division por 0 es erronea");
        } else {
            double division = (valor1 / valor2);
            System.out.println("division=" + division);
        }
    }
}
