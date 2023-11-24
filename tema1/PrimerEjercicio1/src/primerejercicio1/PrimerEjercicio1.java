package primerejercicio1;
import java.util.Scanner;

/**
 *
 * @author cesardavila
 */
public class PrimerEjercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un radio de un circulo");
        double radio = entrada.nextDouble();
        double area = (Math.PI*Math.pow(radio, 2));
        System.out.println(area);
    }
}