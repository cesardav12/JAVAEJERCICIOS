package ejercicio5t2;

import java.util.Scanner;

public class Ejercicio5T2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 1;
        boolean sw = false;
        while (contador < 10) {
            System.out.println("Introduce el numero" + contador + "/10");
            int num = entrada.nextInt();
            if (num < 0) {
                sw = true;
            }
            contador++;
        }
        if (sw==false) {
            System.out.println("No se ha encontrado numeros negativos");
        } else {
            System.out.println("Se ha encontrado numeros negativos");
        }
    }
}
