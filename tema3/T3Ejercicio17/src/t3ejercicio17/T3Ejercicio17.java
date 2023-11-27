package t3ejercicio17;

import java.util.Arrays;
import java.util.Scanner;

public class T3Ejercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int valores[] = new int[30];
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int) (Math.random()*10+0);
        }
        System.out.println("Array sin modificar: " + Arrays.toString(valores));
        Arrays.sort(valores);
        System.out.println("Array ordenado: " + Arrays.toString(valores));
    }
}
