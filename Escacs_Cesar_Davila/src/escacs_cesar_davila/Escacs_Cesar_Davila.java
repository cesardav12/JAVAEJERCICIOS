package escacs_cesar_davila;

import java.util.Arrays;
import java.util.Scanner;

public class Escacs_Cesar_Davila {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean jugadoresSW = true;
        int jugadores;
        int count = 0;
        float media = 0;
        do {
            System.out.println("Cuantos jugadores entraran al torneo?: ");
            jugadores = entrada.nextInt();
            if (jugadores <= 2) {
                System.out.println("ERROR ingrese un valor correcto");
            } else {
                jugadoresSW = false;
            }
        } while (jugadoresSW);
        entrada.nextLine();
        float[] puntuacion = new float[jugadores];
        String[] nombres = new String[jugadores];
        boolean[] calificados = new boolean[jugadores];
        do {
            System.out.println("Ingrese el nombre del participante: ");
            nombres[count] = entrada.nextLine();
            do {
                System.out.println("Ingrese una puntuacion del jugador del 1.0 al 2.0");
                puntuacion[count] = entrada.nextFloat();
                if (puntuacion[count] >= 1 && puntuacion[count] <= 2) {
                    jugadoresSW = false;
                    media = media + puntuacion[count];
                } else {
                    System.out.println("ERROR ingrese una puntuacion correcta");
                    jugadoresSW = true;
                }
            } while (jugadoresSW);
            entrada.nextLine();
            do {
                System.out.println("Ha superado la fase o no la fase previa del torneo?: ");
                String desicion = entrada.nextLine().toLowerCase();
                switch (desicion) {
                    case "si":
                        calificados[count] = true;
                        jugadoresSW = false;
                        break;
                    case "no":
                        calificados[count] = false;
                        jugadoresSW = false;
                        break;
                    default:
                        System.out.println("Ingrese si o no");
                        jugadoresSW = true;
                }
            } while (jugadoresSW);
            count++;
        } while (count < jugadores);
        System.out.println("########## RESULTADOS ##########");
        System.out.println("El total de jugadores que han participado son: " + jugadores);
        System.out.println("la media de puntuacion es: " + media/jugadores);
        System.out.println("");
        System.out.println("////Nombres y puntuacion total de todos los jugadores////");
        for (int i = 0; i < jugadores; i++) {
            System.out.println(nombres[i] + " Ha conseguido: " + puntuacion[i]);
        }
        System.out.println("");
        System.out.println("//// Nombres de los jugadores que superaron la fase previa ////");
        for (int i = 0; i < jugadores; i++) {
            if (calificados[i]) {
                System.out.println(nombres[i] + " Ha conseguido: " + puntuacion[i]);
            }
        }
    }
}
