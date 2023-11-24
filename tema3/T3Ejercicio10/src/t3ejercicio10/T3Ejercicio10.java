package t3ejercicio10;

import java.util.Scanner;

public class T3Ejercicio10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingresa cuantas alturas ingresara");
        int limite = entrada.nextInt();
        float media = 0;
        float medidas[] = new float[limite];
        float minima = 0;
        float maxima = 0;
        int mayorM = 0;
        int menorM = 0;
        System.out.println("Introduce las alturas de una en una");
        for (int i = 0; i < medidas.length; i++) {
            medidas[i] = entrada.nextFloat();
            media = media + medidas[i];
            if (minima == 0 && maxima == 0) {
                minima = medidas[i];
                maxima = medidas[i];
            }
            if (minima > medidas[i]) {
                minima = medidas[i];
            }
            if (maxima < medidas[i]) {
                maxima = medidas[i];
            }
        }
        for (int i = 0; i < medidas.length; i++) {
            if (medidas[i] > media / limite) {
                mayorM++;
            } else {
                menorM++;
            }
        }
        System.out.println("Altura media: " + media / limite);
        System.out.println("Altura maxima: " + maxima);
        System.out.println("Altura minima: " + minima);
        System.out.println("Alturas por encima de la media: " + mayorM);
        System.out.println("Alturas por debajo de la media: " + menorM);
    }

}
