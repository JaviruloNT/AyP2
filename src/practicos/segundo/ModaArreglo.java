package practicos.segundo;

public class ModaArreglo {
    public static void getModa(int[] arr) {
        int[][] modaArr = new int[arr.length][2];
        boolean hasModa = true;
        // Iterar cada valor y agregarlos a modaArr
        int tope = 0; // Indicar cuantas posiciones de modaArr se ocuparon
        for (int v : arr) {
            boolean numNuevo = true;
            // Buscar si el numero ya se conto
            for (int i = 0; i < tope; i++) {
                if (modaArr[i][0] == v) {
                    modaArr[i][1]++;
                    numNuevo = false;
                    break;
                }
            }
            // Agregarlo a modaArr si es un numero nuevo
            if (numNuevo) {
                modaArr[tope][0] = v;
                modaArr[tope][1] = 1;
                tope++;
            }
        }
        // Buscar moda
        int moda = 0;
        for (int i = 1; i < tope; i++) {
            if (modaArr[i][1] > modaArr[moda][1]) { // Si hay mas elementos, es la moda
                moda = i;
                hasModa = true;
            } else if (modaArr[i][1] == modaArr[moda][1]) { // Si los elementos son iguales, puede no haber moda
                hasModa = false;
            }
        }
        // Imprimir moda
        if (hasModa) {
            System.out.println(modaArr[moda][0]);
        } else {
            System.out.println("No hay moda");
        }
    }

    public static void main(String[] args) {
        getModa(new int[]{1,4,3,2,5});
        getModa(new int[]{1,1,3,4,5});
        getModa(new int[]{1,1,2,2,3});
        getModa(new int[]{1});
    }
}
