package cuartoejercicio;

import java.util.Scanner;

public class CuartoEjercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un valor");
        int num1 = entrada.nextInt();
        System.out.println("Ingrese un valor");
        int num2 = entrada.nextInt();
        int suma = (num1 + num2);
        int resta = (num1 - num2);
        double multiplicacion = (num1 * num2);
        double division = (num1 / num2);
        System.out.println("suma: " + suma + " resta: " + resta + " Multiplicacion: " + multiplicacion + " Division: " + division);
    }
}
