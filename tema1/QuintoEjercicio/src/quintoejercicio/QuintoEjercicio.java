package quintoejercicio;

import java.util.Scanner;

public class QuintoEjercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un valor");
        float num1 = entrada.nextFloat();
        if (num1 >= 0) {
            System.out.println("El Numero:" + num1 + " Es positivo");
        } else{
            System.out.println("El Numero:" + num1 + " Es negativo");
        }
    }
}
