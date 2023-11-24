package t3ejercicio9;
import java.util.Scanner;
public class T3Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int count = 0;
        int valores[] = new int[100];
        System.out.println("Ingrese el valor que le dira cuantos son mayores");
        int valor = entrada.nextInt();
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int) (Math.random()*(10-1)) + 1;
            System.out.print(valores[i] + " ");
            if (valores[i] == valor) {
                System.out.println("el numero " + valor + " se encuentra en: " + i);
            }
        }
    }
    
}
