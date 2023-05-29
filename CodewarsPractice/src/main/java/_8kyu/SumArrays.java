package _8kyu;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/53dc54212259ed3d4f00071c
 */
public class SumArrays {
    public static double sum(double[] numbers) {
        if (numbers.length < 1) return 0;
        double sum = 0.0;
        for (double i : numbers) {
            sum += i;
        }
        return sum;
    }

    public static double sumAlter(double[] numbers) {
        return Arrays.stream(numbers).sum();
    }

}
