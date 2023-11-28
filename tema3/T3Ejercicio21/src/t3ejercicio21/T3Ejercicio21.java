
package t3ejercicio21;

import java.util.Scanner;

public class T3Ejercicio21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("ingrese una frase: ");
        String frase1 = entrada.nextLine().toLowerCase().replace(" ", "");
        char [] frase = new char [frase1.length()];
        for (int i = 0; i < frase1.length(); i++) {
            frase = frase1.charAt(i);
        }

        System.out.println(frase);
        for (int i = 0; i < frase.length(); i++) {
            if (frase.compareTo(frase))) {
                
            }
        }
    } 
}
