package ejercicio15t2;

import java.util.Scanner;

public class Ejercicio15T2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valorcambiante = 0, count = 0, count2 = 0;
        System.out.println("ingrese un valor inicial");
        int valorestatico = entrada.nextInt();

        do {
            System.out.println("ingrese un valor");
            valorcambiante = entrada.nextInt();

            if (valorcambiante > valorestatico) {
                valorestatico = valorcambiante;
            } else if (valorcambiante == 0) {

            } else {
                System.out.println("Error el valor no es mayor");
                count2++;
            }
            count++;

        } while (valorcambiante != 0);
        System.out.println("La cantidad de numeros entroducidos es: " + count + " y numeros fallados el total es: " + count2);
    }
}
