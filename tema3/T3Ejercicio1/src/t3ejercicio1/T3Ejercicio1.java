package t3ejercicio1;

import java.util.Scanner;

public class T3Ejercicio1 {
    public static void main(String[] args) {
        float notas[] = new float[] {10,1,8,3,4,5,6,3,9,8,7};
        float notasv2[] = new float[] {9,4,3,4,4,7,9,10,0,0,4};
        float resultado = 0;
        System.arraycopy(notasv2, 0, notas, 1, notas.length - 1);
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
    }
}
