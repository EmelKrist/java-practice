package _6kyu;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
https://www.codewars.com/kata/550498447451fbbd7600041c/
 */
public class AreTheSame {
    public static void main(String[] args) {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        System.out.println(comp(a,b));
        System.out.println(compAlter(a,b));
    }

    /*
    Проходит не все тесты
     */
    public static boolean comp(int[]a, int[]b){
        if ((a == null) || (b == null) || (a.length != b.length)) return false;
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++){
            if (Math.sqrt(b[i]) != a[i]) return false;
        }
        return true;
    }

    public static boolean compAlter(int[] a, int[] b) {
        if ((a.equals(null)) || (b.equals(null)) || (a.length != b.length)) return false;
        return Arrays.equals(IntStream.of(b).sorted().toArray(), IntStream.of(a).map(el -> (el * el)).sorted().toArray());
    }
}
