package ejercicio16;
import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduzca la hora");
        int hora = entrada.nextInt();
        System.out.println("introduzca los minutos");
        int minutos = entrada.nextInt();
        System.out.println("introduzca los segundos");
        int segundos = entrada.nextInt();
        if (segundos==59) {
            segundos = 0;
            if (minutos==59) {
                minutos = 0;
                if (hora==23) {
                    hora = 0;
                } else {
                    hora++;
                }
            } else {
                minutos++;
            }
        } else {
            segundos++;
        }
        System.out.println("Son las" + hora + ":" + minutos + ":" + segundos);
    }
}
