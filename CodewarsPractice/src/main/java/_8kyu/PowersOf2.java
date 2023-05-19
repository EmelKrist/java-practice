package _8kyu;

import java.util.stream.IntStream;

/**
 * https://www.codewars.com/kata/57a083a57cb1f31db7000028
 */
public class PowersOf2 {
    public static long[] powersOfTwo(int n){
        long[] array = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            array[i] = (long) Math.pow(2, i);
        }
        return array;
    }

    public static long[] powersOfTwoAlter(int n){
        return IntStream.rangeClosed(0, n).mapToLong(i -> (long) Math.pow(2, i)).toArray();
    }
}
