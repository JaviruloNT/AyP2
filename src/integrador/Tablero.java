package integrador;

public class Tablero {
    private char[][] tablero = new char[7][6];
    private int[] llenaColumna = new int[7];
    private final Jugador[] jugadores = new Jugador[2];
    private int turno;

    public Tablero(Jugador a, Jugador b) {
        jugadores[0] = a;
        jugadores[1] = b;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 6; j++) {
                tablero[i][j] = ' ';
            }

        }
    }

    // Verificar ganador
    private int verificar() {
        if (turno >= 42) { // Limite de posiciones del tablero
            return -1;
        }
        // -1 = Empate
        // 0 = Sigue jugando
        // 1 = Gana jugador A
        // 2 = Gana jugador B
        // Formula = a+b+c+d - 4*a = 6 siempre que a+b+c+d sean consecutivos
        // TODO: verificar cuando se termina la partida
        // Buscar por columna
        return 0;
    }

    // Finalizar juego

    // Verificar disponibilidad de columna
    private boolean disponible(int columna) {
        return llenaColumna[columna] < 6;
    }

    // Devolver de quien es el turno
    private Jugador jugadorXTurno() {
        if (turno % 2 == 0) {
            return jugadores[0];
        } else {
            return jugadores[1];
        }
    }

    // Realizar un movimiento
    public boolean jugar(int columna) {
        if (columna > 7 || columna <= 0) {
            return false;
        }
        // Pasar a formato 0
        columna -= 1;
        if (disponible(columna)) {
            tablero[columna][llenaColumna[columna]] = jugadorXTurno().getSimbolo();
            jugadorXTurno().addMovimiento(new int[]{columna,llenaColumna[columna]});
            llenaColumna[columna]++;
            turno++;
            print();
            return true;
        }
        return false;
    }

    // Imprimir el juego
    public void print() {
        System.out.println("---------------------");
        // Imprime informacion de la partida
        System.out.printf("JugadorA=%s%nJugadorB=%s%nTurno=%s%n",jugadores[0].getSimbolo(),jugadores[1].getSimbolo(), jugadorXTurno());
        // Imprime numero de columnas
        for (int i = 1; i <= tablero.length; i++) {
            System.out.printf("[%s]",i);
        }
        System.out.printf("%n");
        // Imprime el tablero
        for (int i = tablero[0].length-1; i >= 0; i--) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.printf("[%s]",tablero[j][i]);
            }
            System.out.printf("%n");
        }
        verificar();
    }
}