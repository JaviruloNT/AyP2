package practicos.segundo;

public class Capicua {
    public static boolean isCapicua(String palabra) {
        palabra = palabra.toLowerCase();
        int max = palabra.length();
        //
        for (int i = 0; i < max; i++) {
            max--;
            if (palabra.charAt(i) != palabra.charAt(max)) {
                return false;
            }
        }
        //
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isCapicua("Perro"));
        System.out.println(isCapicua("Reconocer"));
        System.out.println(isCapicua("Gato"));
        System.out.println(isCapicua("12321"));
    }
}
