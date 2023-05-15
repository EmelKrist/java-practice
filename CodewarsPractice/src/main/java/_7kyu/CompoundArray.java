package _7kyu;

/**
 * https://www.codewars.com/kata/56044de2aa75e28875000017
 */
public class CompoundArray {
    public static int[] compoundArray(int[] a, int[] b){
        int[] result = new int[a.length + b.length];
        for (int i = 0,  j = 0; i < result.length; j++){
            if (j < a.length) result[i++] = a[j];
            if (j < b.length) result[i++] = b[j];
        }
        return result;
    }
}
