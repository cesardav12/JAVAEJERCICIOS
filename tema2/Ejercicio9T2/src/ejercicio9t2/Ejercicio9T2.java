package ejercicio9t2;

import java.util.Scanner;

public class Ejercicio9T2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = 1;
        boolean finish = false;
        do {
            System.out.println("Introduce la nota");
            num = entrada.nextInt();
            if (num == 10) {
                finish = true;
            }
        } while (num != -1);
        if (finish == true) {
            System.out.println("Se ha encontrado alguna nota igual a 10");
        } else {
            System.out.println("No se ha encontrado alguna nota con el valor a 10");
        }
    }

}
