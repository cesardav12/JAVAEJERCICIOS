package t3ejercicio18;

import java.util.Scanner;

public class T3Ejercicio18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese una frase: ");
        String text = entrada.nextLine();
        text = text.replace(" ", "\n");
        System.out.println(text);
    }
}
