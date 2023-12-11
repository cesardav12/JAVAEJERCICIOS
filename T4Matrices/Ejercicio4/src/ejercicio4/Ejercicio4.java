package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[][] notas = new float[3][4];
        float media = 0;
        float maxima = 0;
        float minima = 0;
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Ingrese la nota del estudiante #" + (i + 1));
                notas[i][j] = entrada.nextFloat();
                media += notas[i][j];
                if (notas[i][j] == 0) {
                    maxima = notas[i][j];
                    minima = notas[i][j];
                }
                if (notas[i][j] > maxima) {
                    maxima = notas[i][j];
                } else if (notas[i][j] < minima) {
                    minima = notas[i][j];
                }
            }
            System.out.println("Media es: " + media/ + "\nMaxima: " + maxima + "\nMinima: " + minima);
        }
    }
}
