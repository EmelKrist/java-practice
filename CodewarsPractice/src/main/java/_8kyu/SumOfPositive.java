package _8kyu;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/5715eaedb436cf5606000381
 */
public class SumOfPositive {

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i > 0) sum += i;
        }

        return sum;
    }

    public static int sumAlter(int[] arr) {
        return Arrays.stream(arr).filter(i -> i > 0).sum();
    }
}
