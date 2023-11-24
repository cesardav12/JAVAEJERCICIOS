package ejercicio17t2;

import java.util.Scanner;

public class Ejercicio17T2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        int menor = entrada.nextInt();
        System.out.print("ingrese un numero mayor: ");
        int mayor = entrada.nextInt(), operacion = 0, pares = 0;
        while (menor <= mayor) {
            System.out.print(menor + " ");
            operacion = menor % 2;
            if (operacion == 0) {
                pares++;
            }
            menor++;
        }
        System.out.println("");
        System.out.println("la cantidad de pares son: " + pares);
    }
}
