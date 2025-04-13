package practicos.segundo;

import java.util.Arrays;

public class NumeroAVector {
    public static int[] numToVector(int num) {
        String numString = String.valueOf(num);
        int[] numArray = new int[numString.length()];
        //
        for (int i = 0; i < numString.length(); i++) {
            numArray[i] = Character.getNumericValue(numString.charAt(i));
        }
        //
        return numArray;
    }

    public static void main(String[] args) {
        int num = 365;
        System.out.println(Arrays.toString(numToVector(num)));
    }
}
