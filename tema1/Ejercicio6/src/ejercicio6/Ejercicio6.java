package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el precio del articulo");
        double precioArt = scanner.nextDouble();
        System.out.println("introduce el precio de Venta");
        double precioVent = scanner.nextDouble();
        double Descuento = (precioArt - precioVent) * 100 / precioArt;
        System.out.println("El descuento es: " + Descuento);
    }
}
