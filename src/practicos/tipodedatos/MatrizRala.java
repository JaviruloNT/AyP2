package practicos.tipodedatos;

import java.util.Arrays;

public class MatrizRala {
    public static void imprimirMatriz(String titulo, int[][] matriz) {
        System.out.println(titulo);
        for (int[] a : matriz) {
            System.out.println(Arrays.toString(a));
        }
    }
    public static int[][] comprimirRala(int[][] matrizRala) {
        int[][] matrizComp;
        // Contar elementos no nulos
        int contador = 0;
        for (int i = 0; i < matrizRala.length; i++) {
            for (int j = 0; j < matrizRala[0].length; j++) {
                if (matrizRala[i][j] != 0) {
                    contador++;
                }
            }
        }
        matrizComp = new int[contador+1][3];
        int posicion = 1;
        // Definir primeros valores
        matrizComp[0][0] = matrizRala.length;
        matrizComp[0][1] = matrizRala[0].length;
        matrizComp[0][2] = contador;
        // Rellenar matriz comprimida
        for (int i = 0; i < matrizRala.length; i++) {
            for (int j = 0; j < matrizRala[0].length; j++) {
                if (matrizRala[i][j] != 0) {
                    matrizComp[posicion][0] = matrizRala[i][j];
                    matrizComp[posicion][1] = i;
                    matrizComp[posicion][2] = j;
                    posicion++;
                }
            }
        }
        //
        return matrizComp;
    }
    public static int[][] expandirRala(int[][] matrizComp) {
        int[][] matrizRala = new int[matrizComp[0][0]][matrizComp[0][1]];
        //
        for (int i = 1; i < matrizComp.length; i++) {
            matrizRala[matrizComp[i][1]][matrizComp[i][2]] = matrizComp[i][0];
        }
        //
        return matrizRala;
    }

    public static void main(String[] args) {
        int[][] matrizRala = {
                {15,0,0,22,0,-15},
                {0,11,3,0,0,0},
                {0,0,0,-6,0,0},
                {0,0,0,0,0,0},
                {91,0,0,0,0,0},
                {0,0,28,0,0,0}
        };
        imprimirMatriz("Matriz rala original",matrizRala);
        int[][] matrizComp = comprimirRala(matrizRala);
        imprimirMatriz("Matriz rala comprimida",matrizComp);
        matrizRala = expandirRala(matrizComp);
        imprimirMatriz("Matriz rala descomprimida",matrizRala);
    }
}
