package ejercicio10t2;
public class Ejercicio10T2 {
    public static void main(String[] args) {
        int valor = 1;
        int resultado = 0;
        int resultado2 = 1;
        while (valor<=10) {
            resultado = valor + resultado;
            resultado2 = valor * resultado2;
            valor++;
        }
        System.out.println("suma " + resultado);
        System.out.println("multiplicacion " + resultado2);
    }
    
}
