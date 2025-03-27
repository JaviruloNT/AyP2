package integrador;

public class Tablero {
    private boolean jugando = true;
    private char[][] tablero = new char[7][6];
    private int[] llenaColumna = new int[7];
    private final char[] jugadores = new char[2];
    private int turno;

    public Tablero(char a, char b) {
        jugadores[0] = a;
        jugadores[1] = b;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 6; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    // Estado
    public boolean isJugando() {
        return jugando;
    }

    // Verificar ganador
    private boolean verificar(int columna,int fila) {
        // TODO: verificar cuando se termina la partida
        if (turno >= 41) {
            finalizar(-1);
            return true;
        }
        int[][] estados = {
                {1,-1},{1,0},{1,1},
                {0,-1},{0,1},
                {-1,-1},{-1,0},{-1,1}
        };
        for (int i = 0; i < 8; i++) {
            for (int j = 1; j <= 3; j++) {
                try {
                    if (tablero[columna+(estados[i][0]*j)][fila+(estados[i][1]*j)] != jugadorXTurno()) {
                        break;
                    }
                } catch (Exception e) {
                    break;
                }
                if (j == 3) {
                    finalizar(turno%2+1); // Finalizar enviando el jugador del turno actual
                    return true;
                }
            }
        }
        return false;
    }

    // Finalizar juego
    private void finalizar(int situacion) {
        String ganador = switch (situacion) {
            case 1 -> "Jugador A (" + jugadores[0] + ")";
            // Gana jugador A
            case 2 -> "Jugador B (" + jugadores[0] + ")";
            // Gana jugador B
            default -> "Empate";
            // Empate
        };
        System.out.printf("PARTIDA FINALIZADA | GANADOR=%s%n",ganador);
        jugando = false;
    }

    // Verificar disponibilidad de columna
    private boolean disponible(int columna) {
        return llenaColumna[columna] < 6;
    }

    // Devolver de quien es el turno
    private char jugadorXTurno() {
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
            tablero[columna][llenaColumna[columna]] = jugadorXTurno();
            if (!verificar(columna, llenaColumna[columna])) {
                llenaColumna[columna]++;
                turno++;
            }
            print();
            return true;
        }
        return false;
    }

    // Imprimir el juego
    public void print() {
        System.out.println("---------------------");
        // Imprime informacion de la partida
        System.out.printf("JugadorA=%s%nJugadorB=%s%nTurno=%s%n",jugadores[0],jugadores[1],jugadorXTurno());
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
    }
}