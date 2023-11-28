package t3ejercicio19;

import java.util.Scanner;

public class T3Ejercicio19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese el texto nr1:");
        String text1 = entrada.nextLine();
        System.out.println("Ingrese el texto nr2:");
        String text2 = entrada.nextLine();
        System.out.println(text1.compareTo(text2));
    }
}