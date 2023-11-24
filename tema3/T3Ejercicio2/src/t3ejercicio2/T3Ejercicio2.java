package t3ejercicio2;

import java.util.Scanner;

public class T3Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float valor[] = new float[10];
        float mayor = 0;
        float menor = 0;
        for (int i = 0; i < valor.length; i++) {
            System.out.println("ingrese el valor #" + i);
            valor[i] = entrada.nextInt();
            if (menor < valor[i]) {
                mayor = valor[i];
            } else if (mayor > valor[i]){
                menor = valor[i];
            }
        }
        System.out.println("el mayor es: " + mayor + " y el menor es: " + menor);
    }
}
