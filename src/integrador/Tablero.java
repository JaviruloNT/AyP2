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
        // Poblar tablero con espacios para mejor impresion
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
        if (turno >= 41) {
            finalizar(-1);
            return true; // El juego termino al haber llenado la tabla
        }
        // Celdas alrededor de la celda ingresada
        int[][] estados = {
                {1,0}, // Horizontal
                {0,1}, // Vertical
                {1,1}, // Diagonal positiva
                {1,-1} // Diagonal negativa
        };
        for (int i = 0; i < 4; i++) {
            int contador = 1;
            for (int j = 1; j <= 3; j++) {
                // Verifica lado positivo
                try {
                    if (tablero[columna+estados[i][0]*j][fila+estados[i][1]*j] == jugadorXTurno()) {
                        contador++;
                    }
                } catch (Exception _) {
                    continue;
                }
                // Verifica lado negativo
                try {
                    if (tablero[columna+estados[i][0]*-j][fila+estados[i][1]*-j] == jugadorXTurno()) {
                        contador++;
                    }
                } catch (Exception _) {
                    continue;
                }
                if (contador >= 4) {
                    finalizar(turno%2+1); // Devolver el ganador
                    return true;
                }
            }
        }
        return false; // El juego no termino
    }

    // Finalizar juego
    private void finalizar(int situacion) {
        String ganador = switch (situacion) {
            // Gana jugador A
            case 1 -> "Jugador A (" + jugadores[0] + ")";
            // Gana jugador B
            case 2 -> "Jugador B (" + jugadores[0] + ")";
            // Empate
            default -> "Empate";
        };
        System.out.printf("PARTIDA FINALIZADA | GANADOR=%s%n",ganador);
        jugando = false; // Cambiar flag para cortar el while de la clase Main
    }

    // Verificar disponibilidad de columna
    private boolean disponible(int columna) {
        return llenaColumna[columna] < 6;
    }

    // Devolver de quien es el turno
    private char jugadorXTurno() {
        if (turno % 2 == 0) {
            // Turnos pares = Jugador A
            return jugadores[0];
        } else {
            // Turnos impares = Jugador B
            return jugadores[1];
        }
    }

    // Realizar un movimiento
    public boolean jugar(int columna) {
        if (columna > 7 || columna <= 0) {
            return false;// El movimiento fue invalido
        }
        // Pasar a formato 0
        columna -= 1;
        if (disponible(columna)) {
            // Colocar simbolo en el tablero
            tablero[columna][llenaColumna[columna]] = jugadorXTurno();
            if (!verificar(columna, llenaColumna[columna])) {
                // Realizar si el juego se sigue ejecutando
                llenaColumna[columna]++;
                turno++;
            }
            print();
            return true; // El movimiento fue valido
        }
        return false; // El movimiento fue invalido
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
                if (tablero[j][i] == jugadores[0]) {
                    System.out.printf("[\033[31m%s\033[0m]",tablero[j][i]);
                } else if (tablero[j][i] == jugadores[1]) {
                    System.out.printf("[\033[34m%s\033[0m]",tablero[j][i]);
                } else {
                    System.out.printf("[%s]",tablero[j][i]);
                }
            }
            System.out.printf("%n");
        }
    }
}