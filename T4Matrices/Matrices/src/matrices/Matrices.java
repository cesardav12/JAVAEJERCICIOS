package matrices;

import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int tecla;
        int count = 0;
        String pelota = "o";
        int espacios = 10;
        int espaciosP = 12;
        do {
            switch (count) {
                case 0:
                    System.out.println(" ".repeat(espaciosP) + pelota);
                    System.out.println(" ".repeat(espaciosP));
                    System.out.println(" ".repeat(espaciosP));
                    System.out.println(" ".repeat(espaciosP));
                    System.out.println(" ".repeat(espaciosP));
                    System.out.println(" ".repeat(espaciosP));
                    
                    break;
                case 1:
                    System.out.println(" ".repeat(espaciosP));
                    System.out.println(" ".repeat(espaciosP) + pelota);
                    System.out.println(" ".repeat(espaciosP));
                    System.out.println(" ".repeat(espaciosP));
                    System.out.println(" ".repeat(espaciosP));
                    System.out.println(" ".repeat(espaciosP));
                    break;
                case 2:
                    System.out.println(" ".repeat(espaciosP));
                    System.out.println(" ".repeat(espaciosP));
                    System.out.println(" ".repeat(espaciosP) + pelota);
                    System.out.println(" ".repeat(espaciosP));
                    System.out.println(" ".repeat(espaciosP));
                    System.out.println(" ".repeat(espaciosP));
                    break;
                case 3:
                    System.out.println(" ".repeat(espaciosP));
                    System.out.println(" ".repeat(espaciosP));
                    System.out.println(" ".repeat(espaciosP));
                    System.out.println(" ".repeat(espaciosP) + pelota);
                    System.out.println(" ".repeat(espaciosP));
                    System.out.println(" ".repeat(espaciosP));
                    break;
                case 4:
                    System.out.println(" ".repeat(espaciosP));
                    System.out.println(" ".repeat(espaciosP));
                    System.out.println(" ".repeat(espaciosP));
                    System.out.println(" ".repeat(espaciosP));
                    System.out.println(" ".repeat(espaciosP) + pelota);
                    System.out.println(" ".repeat(espaciosP));
                    break;
                case 5:
                    System.out.println(" ".repeat(espaciosP));
                    System.out.println(" ".repeat(espaciosP));
                    System.out.println(" ".repeat(espaciosP));
                    System.out.println(" ".repeat(espaciosP));
                    System.out.println(" ".repeat(espaciosP));
                    System.out.println(" ".repeat(espaciosP) + pelota);
                    break;
                default:
                    
            }
            System.out.println(" ".repeat(espacios) + "-".repeat(5));
            tecla = entrada.nextInt();
            switch (tecla) {
                case 1:
                    espacios--;
                    break;
                case 3:
                    espacios++;
                    break;
                default:  
            }
            if (count == 10) {
                count = 0;
            } 
            count++;
        } while (true);
    }
}
