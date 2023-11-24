package piramide;

import java.util.Scanner;

public class Piramide {

    public static void main(String[] args) {
        int numero;
        int fila = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantas Filas Quieres?: ");
        numero = sc.nextInt();
        int espacios = numero;
        System.out.println("Quieres 1-Asteriscos o 2-numeros");
        int seleccion = sc.nextInt();
        while (fila <= numero) {
            for (int l = espacios; l > 1; l--) {
                System.out.print(" ");
            }
            for (int j = 1 + (fila - 1) * 2; j > 0; j--) {
                if (seleccion == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(fila);
                }
            }
            System.out.println("");
            fila++;
            espacios--;
        }
    }
}
