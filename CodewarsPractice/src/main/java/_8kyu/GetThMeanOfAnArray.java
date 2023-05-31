package _8kyu;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/563e320cee5dddcf77000158
 */
public class GetThMeanOfAnArray {
    public static int getAverage(int[] marks) {
        return Arrays.stream(marks).sum() / marks.length;
    }

    public static int getAverageAlter(int[] marks) {
        return (int) Arrays.stream(marks).average().orElse(Double.NaN);
    }

    public static int getAverageAlterTwo(int[] marks) {
        int sum = 0;
        for (int i : marks) {
            sum += i;
        }
        return sum / marks.length;
    }
}
