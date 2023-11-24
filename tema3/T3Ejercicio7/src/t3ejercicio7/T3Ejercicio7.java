package t3ejercicio7;

import java.util.Scanner;

public class T3Ejercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un valor minimo");
        int valor1 = entrada.nextInt();
        System.out.println("Ingrese el valor maximo");
        int valor2 = entrada.nextInt();
        int valores[] = new int[valor2 - valor1 + 1];
        for (int i = 0; i < valores.length; i++) {
            valores[i] = valor1;
            valor1++;
            System.out.print(valores[i] + " ");
        }
        System.out.println("");
    }

}
