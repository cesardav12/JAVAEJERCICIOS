package t3ejercicio13;

import java.util.Scanner;

public class T3Ejercicio13 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese valor de inicio: ");
        int valorN = entrada.nextInt();
        System.out.println("Ingrese el tamaño del Array: ");
        int secuencia[] = new int[entrada.nextInt()];
        System.out.println("Ingrese el tamaño de incremento");
        int aritmetica = entrada.nextInt();
        secuencia[0] = valorN;
        System.out.print(secuencia[0] + " ");
        for (int i = 1; i < 10; i++) {
            secuencia[i] = secuencia[i - 1] + aritmetica;
            System.out.print(secuencia[i] + " ");
        }
    }

}
