package _8kyu;

import java.util.stream.IntStream;

/**
 * https://www.codewars.com/kata/5513795bd3fafb56c200049e
 */
public class CountByX {
    public static int[] countBy(int x, int n){
        int[] numbers = new int[n];
        for (int i = 1; i <= numbers.length; i++) {
            numbers[i - 1] = i * x;
        }
        return numbers;
    }

    public static int[] countByAlter(int x, int n){
        return IntStream.range(1, n).map(i -> i * x).toArray();
    }

    public static int[] countByAlterTwo(int x, int n){
        return IntStream.iterate(x, it -> it + x).limit(n).toArray();
    }
}
