package _8kyu;

import java.util.stream.IntStream;

/**
 * https://www.codewars.com/kata/57241e0f440cd279b5000829
 */
public class SumOfMultiples {
    public static long sumMul(int n, int m) {
        if (m < 1 || n < 1) throw new IllegalArgumentException();
        int sum = 0;
        for (int i = n; i < m; i++) {
            if (i % n == 0) sum+=i;
        }
        return sum;
    }

    public static long sumMulAlter(int n, int m) {
        if (m < 1 || n < 1) throw new IllegalArgumentException();
        return IntStream.range(n, m).filter(i -> i % n == 0).sum();
    }

    public static long sumMulAlterTwo(int n, int m) {
        if (m < 1 || n < 1) throw new IllegalArgumentException();
        int x = (m - 1) / n;
        return (long) (n * 0.5 * x * (x + 1));
    }
}
