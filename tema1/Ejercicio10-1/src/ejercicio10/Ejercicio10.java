package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un valor");
        int valor1 = scanner.nextInt();
        System.out.println("Introduce otro valor");
        int valor2 = scanner.nextInt();
        int suma = (valor1 + valor2);
        int resta = (valor1 - valor2);
        int producto = (valor1 * valor2);
        System.out.println("a+b=" + suma + " a-b=" + resta + " a*b=" + producto);
        if (valor2 == 0) {
            System.out.println("Error en la division por 0");
        } else {
            int division = (valor1 / valor2);
            System.out.println("a/b=" + division);
        }
    }
}
