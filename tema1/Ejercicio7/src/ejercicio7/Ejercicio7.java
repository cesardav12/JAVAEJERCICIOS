package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una distancia en millas marinas");
        double millas = scanner.nextDouble();
        double millasm = (millas * 1852);
        System.out.println("la cantidad de metros en millas son: " + millasm);
    }
}
