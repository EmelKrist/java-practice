package _7kyu;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/5806445c3f1f9c2f72000031
 */
public class MeanVsMedian {
    public static String meanVsMedian(int[] numbers) {
        Arrays.sort(numbers);
        double mean = Arrays.stream(numbers).average().getAsDouble();
        int median = numbers[numbers.length / 2];
        return median >= mean ? median > mean ? "median" : "same" : "mean";
    }
}
