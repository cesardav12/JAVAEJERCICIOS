package t3ejercicio14;

import java.util.Arrays;

import java.util.Scanner;

public class T3Ejercicio14 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el tamaño del array: ");
        int valor[] = new int[entrada.nextInt()];
        System.out.println("Ingrese el valor a introducir en el array: ");
        Arrays.fill(valor, entrada.nextInt());
        System.out.println(Arrays.toString(valor));
    }
}
