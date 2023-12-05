package t3ejercicio21;

import java.util.Scanner;

public class T3Ejercicio21 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la altura de la U: ");
        int altura = entrada.nextInt();
        for (int i = 0; i < altura - 1; i++) { // LAS PRIMERAS FILAS RESTANDOLE 1
            System.out.print("*");
            for (int j = 0; j < altura - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        System.out.print(" ");
        for (int j = 0; j < altura - 2; j++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
