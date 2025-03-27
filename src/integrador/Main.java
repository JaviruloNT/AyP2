package integrador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tablero juego = new Tablero('X','O');
        juego.print();
        while (juego.isJugando()) {
            System.out.println("Elija una columna");
            int col = sc.nextInt();
            // Verifica si el movimiento es invalido
            if (!juego.jugar(col)) {
                System.out.println("Columna invalida");
            }
        }
    }
}
