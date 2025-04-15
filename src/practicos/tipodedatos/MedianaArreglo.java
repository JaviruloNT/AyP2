package practicos.tipodedatos;

public class MedianaArreglo {
    public static float getMedian(int[] arr) {
        // Ordenar arr (Seleccion)
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        //
        int mediana = arr.length/2;
        if (arr.length % 2 == 0) { // Arreglo Par
            return (float)(arr[mediana-1]+arr[mediana])/2;
        } else { // Arreglo Impar
            return arr[mediana]; //
        }
    }

    public static void main(String[] args) {
        int[] arregloPar1 = {2,3};
        int[] arregloImpar1 = {2,3,4};
        int[] arregloImpar2 = {3,7,4};
        int[] arregloPar2 = {5,7,9,3};
        int[] arregloPar3 = {42, 17, 9, 55, 28, 12, 81, 3};
        System.out.println(getMedian(arregloPar1)); // 2,5
        System.out.println(getMedian(arregloImpar1)); // 3
        System.out.println(getMedian(arregloImpar2)); // 4
        System.out.println(getMedian(arregloPar2)); // 4
        System.out.println(getMedian(arregloPar3)); //
    }
}
