package ejercicio8t2;
import java.util.Scanner;
public class Ejercicio8T2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int negativos = 0;
        int positivos = 0;
        int num = 1;
        boolean finish = false;
        do {
            System.out.println("Introduce el numero");
            num = entrada.nextInt();              
            if (num==0) {
                finish = true;
            } else if (num>0) {
                positivos++;
            } else {
                negativos++;
            }
        } while (finish==false);
        System.out.println("El numero total de negativos es: " + negativos + " el numero total de positivos es: " + positivos);
    }
}
