package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int countiguales = 0;
        int countmayores = 0;
        int countmenores = 0;
        System.out.println("ingrese el tamaño de las filas");
        int filas = entrada.nextInt();
        System.out.println("ingrese el tamaño de columnas");
        int columnas = entrada.nextInt();
        int matri[][] = new int [filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Ingrese el valor a ingresar de la fila #" + (i+1) + " y columna #" + (j+1));
                matri[i][j] = entrada.nextInt();
                if (matri[i][j] == 0) {
                    countiguales++;
                } else if (matri[i][j] > 0) {
                    countmayores++;
                } else if (matri[i][j] < 0) {
                    countmenores++;
                }
            }
        }
        System.out.println("numeros = 0: " + countiguales + "\nnumeros > 0 : " + countmayores + "\nnumeros < 0: " + countmenores);
    }
}