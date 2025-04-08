package practicos.segundo;

public class ContadorPalabras {
    public static int contarPalabras(String str) {
        int counter = 0;
        boolean esPalabra = false;
        if (str.isEmpty()) {return 0;} // Devolver en caso de string vacio.
        //
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') { // Si es un espacio
                if (esPalabra) { // Y venia de una palabra
                    esPalabra = false; // Termino la palabra anterior
                }
            } else { // Si es un caracter
                if (!esPalabra) { // Y venia de un espacio
                    esPalabra = true; // Empezo una palabra nueva
                    counter++; // Sumar al contador
                }
            }
        }
        //
        return counter;
    }
    public static void main(String[] args) {
        System.out.println(contarPalabras("")); // 0
        System.out.println(contarPalabras("a")); // 1
        System.out.println(contarPalabras("0")); // 1
        System.out.println(contarPalabras("Pedro Sanchez")); // 2
        System.out.println(contarPalabras("             ")); // 0
        System.out.println(contarPalabras("asd   dklsahdk wdawjkdl a   dkwjald")); // 5
    }
}
