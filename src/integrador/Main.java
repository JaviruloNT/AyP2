package integrador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tablero juego = new Tablero(new Jugador('X'),new Jugador('O'));
        juego.print();
        while (true) {
            // TODO: agregar condicion para salir del while
            System.out.println("Elija una columna");
            int col = sc.nextInt();
            if (!juego.jugar(col)) {
                System.out.println("Columna invalida");
            }
        }
    }
}
