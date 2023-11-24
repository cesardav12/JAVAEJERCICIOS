package ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        double salario = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = entrada.nextLine();
        System.out.println("¿Cuantas horas trabajaste esta semana?");
        int horasT = entrada.nextInt();
        System.out.println("Precio hora Tarifa normal");
        int tarifa = entrada.nextInt();
        if (horasT <= 35) {
            salario = horasT * tarifa;
        } else {
            salario = 35 * tarifa + (horasT - 35) * tarifa * 1.5;
        }
        double impuesto = 0;
        if (salario > 900) {
            impuesto = (400 * 0.25) + (salario - 900) * 0.45;
        } else {
            if (salario > 500) {
                impuesto = (salario - 500) * 0.25;
            }
        }
        double neto = (salario - impuesto);
        System.out.println("El salario neto de " + nombre + " asciende a: " + neto + ".-$" + "Impuestos: " + impuesto);
    }
}
