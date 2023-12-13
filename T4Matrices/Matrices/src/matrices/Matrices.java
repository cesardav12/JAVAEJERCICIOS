package matrices;

public class Matrices {

    public static void main(String[] args) {
        int min = 100, max = 1000;
        int[][] matri = new int[4][5];
        int[][] sumas = new int[2][matri[1].length];
        for (int i = 0; i < matri.length; i++) {
            for (int j = 0; j < matri[i].length; j++) {
                matri[i][j] = (int) (Math.random() * (max - min) + min);
                sumas[0][j] += matri[i][j];
                sumas[1][i] += matri[i][j];
                sumas[1][sumas[0].length - 1] += matri[i][j];
            }
        }
        for (int i = 0; i < matri.length; i++) {
            for (int j = 0; j < matri[i].length; j++) {
                System.out.printf("%10s", matri[i][j]);

            }
            System.out.printf("%4s", "|");
            System.out.printf("%10s", sumas[1][i] + "\n");
            if (i == matri.length) {
                System.out.print("-".repeat(matri[1].length * 15) + "\n");
            }
        }
        System.out.print("-".repeat(matri[1].length * 15) + "\n");
        for (int j = 0; j < sumas[0].length; j++) {
            System.out.printf("%10s", sumas[0][j]);
        }
        System.out.printf("%4s", "|");
        System.out.printf("%10s", sumas[1][sumas[0].length-1] + "\n");
    }
}
