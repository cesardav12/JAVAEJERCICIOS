package t3ejercicio4;

import java.util.Scanner;

public class T3Ejercicio4 {
    public static void main(String[] args) {
        int totalN = 0;
        int totalP = 0;
        Scanner entrada = new Scanner (System.in);
        int numeros[] = new int [20];
        System.out.println("Ingrese 20 valores: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un valor: ");
            numeros[i] = entrada.nextInt();
            if (numeros[i]>=0) {
                totalP = totalP + numeros[i];
            } else {
                totalN = totalN + numeros[i];
            }
        }
        System.out.println("El total de la suma de todos los numeros positivos es: " + totalP + " y la suma de todos los numeros negativos es: " + totalN);
    }

}
