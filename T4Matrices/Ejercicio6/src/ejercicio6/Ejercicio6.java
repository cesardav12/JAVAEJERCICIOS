package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float mediaF = 0;
        float mediaM = 0;
        int count = 0;
        System.out.println("Cuantas personas se registraran en el programa?");
        int espa = entrada.nextInt();
        float[][] brr = new float [2][espa];
        for (int j = 0; j < espa; j++) {
                System.out.println("Ingrese su genero 1-Hombre o 2-Mujer");
                brr[0][j] = entrada.nextFloat();
                System.out.println("Ingrese su sueldo");
                brr[1][j] = entrada.nextFloat();
                if (brr[0][j] == 1) {
                mediaM += brr[1][j];
                count++;
                } else {
                  mediaF += brr[1][j]; 
                }
            }
        System.out.println("la media de los hombres es: " + mediaM/count);
        System.out.println("la media de las mujeres es: " + mediaF/(espa-count));
    }
}
