package ejercicio2tarea;
public class Ejercicio2Tarea {
    public static void main(String[] args) {
        int multi = 1;
        int tabla [][] = new int [10] [10];
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = multi * (j + 1);
                System.out.print(tabla[i][j] + " ");
            }
            multi++;
            System.out.println("");
        }
    }
}
