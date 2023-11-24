
package t3ejercicio15;

import java.util.Arrays;

public class T3Ejercicio15 {
    
    public static void main(String[] args) {
        int tamano = 0;
        for (int i = 10; i > 0; i--) {
            tamano = tamano + i;
        }
        int vector[] = new int [tamano];
        int cont = 0;
        for (int i = 1; i <= 10; i++) {
            Arrays.fill(vector, cont, 1 + vector.length - 1, i);
            cont = i + cont;
        }
        Arrays.sort(vector);
        System.out.println(Arrays.toString(vector));
    }
}
