package t3ejercicio11;

public class T3Ejercicio11 {
    public static void main(String[] args) {
        int valores1[] = new int [100];
        int valores2[] = new int [100];
        for (int i = 0; i < valores1.length; i++) {
            valores1[i] = i + 1;
            System.out.print(valores1[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < valores2.length   ; i++) {
            valores2[i] = valores1[valores2.length - i - 1];
            System.out.print(valores2[i] + " ");  
        }   
    }
}
