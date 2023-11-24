package t3arrays;

import java.util.Scanner;

public class T3Arrays {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numeros[] = new int[5];
        System.out.println("Ingrese un valor");
        for (int i = 0; i < 5; i++) {
            numeros[i] = entrada.nextInt();
        }
        System.out.println("--------------------------");
        for (int l = 0; l < 5; l++) {
            System.out.println(numeros[l]);
        }
        System.out.println("el total de filas en el array numeros es: " + numeros.length);
    } 
}
