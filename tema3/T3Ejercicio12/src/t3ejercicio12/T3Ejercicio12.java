package t3ejercicio12;
import java.util.Scanner;
public class T3Ejercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valores[] = new int [10];
        String menuL;
        int valor = 0;
        int posicion = 0;
        boolean sw = true;
        do {
        System.out.println("MENU PRINCIPAL");
        System.out.println("a. Mostrar valores");
        System.out.println("b. Introducir valor");
        System.out.println("c. Salir");
        menuL = entrada.nextLine();
        switch (menuL) {
            case "a":
                for (int i = 0; i < valores.length; i++) {
                    System.out.print(valores[i] + " ");
                }
                break;
            case "b":
                System.out.println("Que Valor Desea ingresar?:");
                valor = entrada.nextInt();
                System.out.println("En que posicion?:");
                posicion = entrada.nextInt();
                if (posicion > valores.length) {
                    System.out.println("Ingrese un valor correcto");
                } else {
                    valores[posicion] = valor;
                }
                break;
            case "c":
                sw = false;
                break;
            default:
                System.out.println("Ingrese un valor correcto");
        }
        } while (sw);
    }
    
}
