package practicos.tipodedatos;

import java.util.Arrays;

public class InvertidorVectores {
    public static String printArr(int[] arr) {
        return Arrays.toString(arr);
    }
    public static int[] invertirVector(int[] arr) {
        //
        for (int i = 0; i < arr.length/2; i++) {
            int j = arr.length - 1 - i;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //
        return arr;
    }

    public static void main(String[] args) {
        int[] vA = {1,2,3,4,5};
        int[] vB = {6,3,8,4};
        int[] vC = {1};
        int[] vD = {};
        //
        System.out.println(printArr(vA));
        System.out.println(printArr(invertirVector(vA)));
        System.out.println(printArr(vB));
        System.out.println(printArr(invertirVector(vB)));
        System.out.println(printArr(vC));
        System.out.println(printArr(invertirVector(vC)));
        System.out.println(printArr(vD));
        System.out.println(printArr(invertirVector(vD)));
    }
}
