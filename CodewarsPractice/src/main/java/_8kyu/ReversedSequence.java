package _8kyu;

import java.util.stream.IntStream;

/**
 * https://www.codewars.com/kata/5a00e05cc374cb34d100000d
 */
public class ReversedSequence {
    public static int[] reverse(int n) {
        int[] array = new int[n];
        for (int i = n; i >= 1; i--) {
            array[n - i] = i;
        }
        return array;
    }

    public static int[] reverseAlter(int n) {
        return IntStream.range(-n, 0).map(Math::abs).toArray();
    }
}
