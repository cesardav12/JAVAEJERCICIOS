package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quinientos = 0, doscientos = 0, cien = 0, cincuenta = 0, veinte = 0, diez = 0, cinco = 0;
        System.out.println("Introduce un monto");
        int dinero = entrada.nextInt();
        while (dinero > 1) {
            if (dinero >= 500) {
                quinientos++;
                dinero = dinero - 500;
            } else if (dinero >= 200) {
                doscientos++;
                dinero = dinero - 200;
            } else if (dinero >= 100) {
                cien++;
                dinero = dinero - 100;
            } else if (dinero >= 50) {
                cincuenta++;
                dinero = dinero -  50;
            } else if (dinero >= 20) {
                veinte++;
                dinero = dinero - 20;
            } else if (dinero >= 10) {
                diez++;
                dinero = dinero - 10;
            } else {
                cinco++;
                dinero = dinero - 5;
            }
        }
        System.out.println(quinientos + " billetes de 500");
        System.out.println(doscientos + " billetes de 200");
        System.out.println(cien + " billetes de 100");
        System.out.println(cincuenta + " billetes de 50");
        System.out.println(veinte + " billetes de 20");
        System.out.println(diez + " billetes de 10");
        System.out.println(cinco + " billetes de 5");
    }
}
