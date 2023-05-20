package _8kyu;

import java.util.stream.IntStream;

/**
 * https://www.codewars.com/kata/57a2013acf1fa5bfc4000921
 */
public class CalculateAverage {
    public static double find_average(int[] array) {
        return array.length != 0 ? (double) IntStream.of(array).reduce(Integer::sum).getAsInt() / array.length : 0;
    }

    public static double find_average_alter(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }

    public static double find_average_alter_two(int[] array) {
        return IntStream.of(array).average().orElse(0);
    }
}
