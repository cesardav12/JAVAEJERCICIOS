package segundoejercicio;

import java.util.Scanner;

public class SegundoEjercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un valor del 1/10");
        double valor = entrada.nextDouble();
        if (valor >= 0 && valor <= 10) {
            if (valor <= 3) {
                System.out.println("Muy Mal");
            } else if (valor <= 5) {
                System.out.println("Insuficiente");
            } else if (valor <= 6) {
                System.out.println("Bien");
            } else if (valor <= 8) {
                System.out.println("Notables");
            } else {
                System.out.println("Exelente");
            }
        }
    }
}