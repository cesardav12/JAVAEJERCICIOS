package t3ejercicioclasestring;
public class T3EjercicioClaseString {
    public static void main(String[] args) {
        String s1 = "Prueba de texto";
        String s2 = "Prueba de Texto";
        System.out.print("Comprobemos si son iguales:");
        System.out.println(s1.equals(s2));
        System.out.print("Ahroa comprobemos si son iguales, ahora sin contar las mayusculas: ");
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.print("Comprobemos ahora considerando el orden alfabetico: ");
        System.out.println(s1.compareTo(s2));
        System.out.print("Comparesmoslas considerando el orden alfabetico, ahora sin contar con las mayusculas: ");
        System.out.println(s1.compareToIgnoreCase(s2));
        
        String s3 = "Papallona";
        System.out.println(s3.replace('a', 'e'));
        System.out.println(s3);
        s3 = s3.replace('a', 'e');
        System.out.println(s3);
        
        double s4 = (double) Math.random();
        System.out.println(String.format("%.2f", s4));
    }
}
