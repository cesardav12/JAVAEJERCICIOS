package t3ejercicio12;

import java.util.Scanner;

public class T3Ejercicio12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese valor inicial: ");
        int valorN = entrada.nextInt();
        System.out.println("Ingrese la cantidad de valores a crear: ");
        int secuencia[] = new int[entrada.nextInt()];
        System.out.println("Ingrese la secuencia aritmetica: ");
        int aritmetica = entrada.nextInt();
        secuencia[0] = valorN;
        System.out.println(secuencia[0]);
        for (int i = 1; i < secuencia.length; i++) {
            secuencia[i] = secuencia[i-1] + aritmetica;
            System.out.println(secuencia[i]);
        }
    }
}