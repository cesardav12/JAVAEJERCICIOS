package ejercicio2t2;

import java.util.Scanner;

public class Ejercicio2T2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el limite");
        int limite = entrada.nextInt();
        int contador = 0;
        int par = 0;
        while(contador<limite){
            contador++;
            System.out.println(contador);
        }
    }   
}