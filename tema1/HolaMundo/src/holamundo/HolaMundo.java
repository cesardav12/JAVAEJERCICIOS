package holamundo;

import java.util.Scanner;

/**
 *
 * @author cesardavila
 */
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Aqui tienes Los numeros para que aprendas a contar");
        int x=5;
        double pi = Math.PI;
        boolean resultat = ++x>=6;
        System.out.println(resultat);
        System.out.println(x);
        System.out.println(pi);
        System.out.println("Primera linea\nSegunda Linea de string");
        System.out.println("Hola");
        
        String nombre;
            Scanner entrada = new Scanner(System.in);
            System.out.println("¿Cual es el problema de venezuela? ");
            nombre = entrada.nextLine();
            System.out.println("Correcto el problema es: " + nombre);
        }
    }

