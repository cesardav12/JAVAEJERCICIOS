package ejercicio16t2;
import java.util.Scanner;
public class Ejercicio16T2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num = entrada.nextInt();
        int count = 0;
        if (num>=0) {
            while (num>=1) {
                System.out.print("*");
                num--;
            }
        } else
            System.out.print("*");
            System.out.println("");
    }
    
}
