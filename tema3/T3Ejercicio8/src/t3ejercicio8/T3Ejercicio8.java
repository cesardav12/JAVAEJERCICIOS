package t3ejercicio8;

import java.util.Scanner;

public class T3Ejercicio8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int count = 0;
        float valores[] = new float[100];
        System.out.println("Ingrese el valor que le dira cuantos son mayores");
        float valor = entrada.nextFloat();
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (float) Math.random();
            System.out.printf("%.2f \n",valores[i]);
            if (valores[i] >= valor) {
                count++;
            }
        }
        System.out.println("el total de numeros mayores a " + valor + " son: " + count);
    }
}
