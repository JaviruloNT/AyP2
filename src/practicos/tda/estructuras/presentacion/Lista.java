package practicos.tda.estructuras.presentacion;

public class Lista {
    private int[] datos;
    private int pointer;
    //
    public Lista(int tam) {
        datos = new int[tam];
        pointer = 0;
    }

    /** ADD
     * Agregar un elemento a la lista.
     * @param elem elemento a agregar
     */
    public void add(int elem) {
        while (datos[pointer] != 0) {
            pointer++;
        }
        datos[pointer] = elem;
        pointer++;
    }

    /** INSERT
     * Insertar un elemento en una posicion especifica de la lista.
     * @param elem elemento a agregar
     * @param pos posicion en la que se insertara el elemento
     */
    public void insert(int elem,int pos) {
        if (datos[pos] == 0) {
            datos[pos] = elem;
        } else {
            for (int i = 0; i <= pointer - pos; i++) {
                datos[pointer-i] = datos[pointer-i-1];
            }
            datos[pos] = elem;
            pointer++;
        }
    }
    @Override
    public String toString() {
        String text = "[";
        for (int i = 0; i < datos.length; i++) {
            if (i != datos.length - 1) {
                text += datos[i] + ",";
            } else {
                text += datos[i] + "]";
            }
        }
        return text;
    }
}
