package pingpong;

import java.util.Scanner;

public class Pingpong {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tecla;
        int count = 0;
        boolean sw = true;
        String pelota = "o";
        int espacios = 11;
        int espacios2 = 11;
        int espaciosP = 13;
        int espaciosP2 = 13;
        do {
            switch (count) {
                case 0:
                    System.out.println(" - ".repeat((espaciosP + espacios + 1) / 3 + 2));
                    System.out.println("|" + " ".repeat(espaciosP) + pelota + " ".repeat(espaciosP2 - 1) + "|");
                    System.out.println("|" + " ".repeat(espaciosP) + " ".repeat(espaciosP2) + "|");
                    System.out.println("|" + " ".repeat(espaciosP) + " ".repeat(espaciosP2) + "|");
                    System.out.println("|" + " ".repeat(espaciosP) + " ".repeat(espaciosP2) + "|");
                    System.out.println("|" + " ".repeat(espaciosP) + " ".repeat(espaciosP2) + "|");
                    System.out.println("|" + " ".repeat(espaciosP) + " ".repeat(espaciosP2) + "|");

                    break;
                case 1:
                    System.out.println(" - ".repeat((espaciosP + espacios + 1) / 3 + 2));
                    System.out.println("|" + " ".repeat(espaciosP) + " ".repeat(espaciosP2) + "|");
                    System.out.println("|" + " ".repeat(espaciosP) + pelota + " ".repeat(espaciosP2 - 1) + "|");
                    System.out.println("|" + " ".repeat(espaciosP) + " ".repeat(espaciosP2) + "|");
                    System.out.println("|" + " ".repeat(espaciosP) + " ".repeat(espaciosP2) + "|");
                    System.out.println("|" + " ".repeat(espaciosP) + " ".repeat(espaciosP2) + "|");
                    System.out.println("|" + " ".repeat(espaciosP) + " ".repeat(espaciosP2) + "|");
                    break;
                case 2:
                    System.out.println(" - ".repeat((espaciosP + espacios + 1) / 3 + 2));
                    System.out.println("|" + " ".repeat(espaciosP) + " ".repeat(espaciosP2) + "|");
                    System.out.println("|" + " ".repeat(espaciosP) + " ".repeat(espaciosP2) + "|");
                    System.out.println("|" + " ".repeat(espaciosP) + pelota + " ".repeat(espaciosP2 - 1) + "|");
                    System.out.println("|" + " ".repeat(espaciosP) + " ".repeat(espaciosP2) + "|");
                    System.out.println("|" + " ".repeat(espaciosP) + " ".repeat(espaciosP2) + "|");
                    System.out.println("|" + " ".repeat(espaciosP) + " ".repeat(espaciosP2) + "|");
                    break;
                case 3:
                    System.out.println(" - ".repeat((espaciosP + espacios + 1) / 3 + 2));
                    System.out.println("|" + " ".repeat(espaciosP) + " ".repeat(espaciosP2) + "|");
                    System.out.println("|" + " ".repeat(espaciosP) + " ".repeat(espaciosP2) + "|");
                    System.out.println("|" + " ".repeat(espaciosP) + " ".repeat(espaciosP2) + "|");
                    System.out.println("|" + " ".repeat(espaciosP) + pelota + " ".repeat(espaciosP2 - 1) + "|");
                    System.out.println("|" + " ".repeat(espaciosP) + " ".repeat(espaciosP2) + "|");
                    System.out.println("|" + " ".repeat(espaciosP) + " ".repeat(espaciosP2) + "|");
                    break;
                case 4:
                    System.out.println(" - ".repeat((espaciosP + espacios + 1) / 3 + 2));
                    System.out.println("|" + " ".repeat(espaciosP) + " ".repeat(espaciosP2) + "|");
                    System.out.println("|" + " ".repeat(espaciosP) + " ".repeat(espaciosP2) + "|");
                    System.out.println("|" + " ".repeat(espaciosP) + " ".repeat(espaciosP2) + "|");
                    System.out.println("|" + " ".repeat(espaciosP) + " ".repeat(espaciosP2) + "|");
                    System.out.println("|" + " ".repeat(espaciosP) + pelota + " ".repeat(espaciosP2 - 1) + "|");
                    System.out.println("|" + " ".repeat(espaciosP) + " ".repeat(espaciosP2) + "|");
                    break;
                case 5:
                    System.out.println(" - ".repeat((espaciosP + espacios + 1) / 3 + 2));
                    System.out.println("|" + " ".repeat(espaciosP) + " ".repeat(espaciosP2) + "|");
                    System.out.println("|" + " ".repeat(espaciosP) + " ".repeat(espaciosP2) + "|");
                    System.out.println("|" + " ".repeat(espaciosP) + " ".repeat(espaciosP2) + "|");
                    System.out.println("|" + " ".repeat(espaciosP) + " ".repeat(espaciosP2) + "|");
                    System.out.println("|" + " ".repeat(espaciosP) + " ".repeat(espaciosP2) + "|");
                    System.out.println("|" + " ".repeat(espaciosP) + pelota + " ".repeat(espaciosP2 - 1) + "|");
                default:

            }
            System.out.println("|" + " ".repeat(espacios) + "-".repeat(5) + " ".repeat(espacios2 - 1) + "|");
            tecla = entrada.nextInt();
            switch (tecla) {
                case 1:
                    espacios = espacios - 2;
                    espacios2 = espacios2 + 2;
                case 3:
                    espacios++;
                    espacios2--;
                default: {
                }
            }
            if (sw) {
                count++;
                if (count==5) {
                    sw = false;
                }
            } else {
                count--;
                if (count==0) {
                    sw = true;
                }
            }
        } while (true);
    }
}
