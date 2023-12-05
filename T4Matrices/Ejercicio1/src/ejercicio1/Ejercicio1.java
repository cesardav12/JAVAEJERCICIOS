package ejercicio1;
public class Ejercicio1 {
    public static void main(String[] args) {
        int vecto[][] = new int [5] [5];
        int numero = 0;
        for (int i = 0; i < vecto.length; i++) {
            for (int j = 0; j < vecto[i].length; j++) {
                numero++;
                vecto[i][j] = numero;
                System.out.print(vecto[i][j] + " ");
            }
            System.out.println("");
        }
    }  
}
