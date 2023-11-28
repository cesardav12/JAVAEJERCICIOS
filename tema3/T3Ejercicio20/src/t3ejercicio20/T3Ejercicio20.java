package t3ejercicio20;

import java.util.Arrays;
import java.util.Scanner;

public class T3Ejercicio20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] texto = new String [3];
        
        for (int i = 0; i < texto.length; i++) {
            if (i<1) {
                System.out.println("ingrese el nombre: ");
                texto[i] = entrada.nextLine().toUpperCase();
            } else {
                System.out.println("ingrese el apellido: ");
                texto[i] = entrada.nextLine().toUpperCase();
            }
        }
        texto[1].substring(0,3)
        texto[1].substring(0,3)
    }
    
}
