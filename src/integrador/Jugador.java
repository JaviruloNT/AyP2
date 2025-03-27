package integrador;

public class Jugador {
    private final char simbolo;
    private int[][] movimientos = new int[21][2];

    public Jugador(char simbolo) {
        this.simbolo = simbolo;
        for (int i = 0; i < 21; i++) {
            for (int j = 0; j < 2; j++) {
                movimientos[i][j] = -1;
            }
        }
    }

    public char getSimbolo() {
        return simbolo;
    }

    public void addMovimiento(int[] movimiento) {
        for (int i = 0; i < 21; i++) {
            if (movimientos[i][0] == -1) {
                movimientos[i][0] = movimiento[0];
                movimientos[i][1] = movimiento[1];
                break;
            }
        }
    }

    public int[][] getMovimientos() {
        return movimientos;
    }
}
