package _8kyu;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

/**
 * https://www.codewars.com/kata/576b93db1129fcf2200001e6
 */
public class SumWithoutHighestAndLowestNumber {
    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length < 2) return 0;
        int lowest = numbers[0], highest = numbers[0], sumWithoutHighest = 0;
        for (int i = 1; i < numbers.length; i++) {

            if (highest > numbers[i])
                sumWithoutHighest += numbers[i];
            else {
                sumWithoutHighest += highest;
                highest = numbers[i];
            }

            if (lowest > numbers[i])
                lowest = numbers[i];
        }

        return sumWithoutHighest - lowest;
    }

    public static int sumAlter(int[] numbers) {
        if (numbers == null || numbers.length < 2) return 0;
        int lowest = numbers[0], highest = numbers[0], sum = 0;
        for (int i = 1; i < numbers.length; i++) {
            sum += numbers[i];
            if (numbers[i] > highest) highest = numbers[i];
            if (numbers[i] > lowest) lowest = numbers[i];
        }

        return sum - lowest - highest;
    }

    public static int sumAlterTwo(int[] numbers) {
        if (numbers == null || numbers.length <= 1) return 0;
        IntSummaryStatistics stat = Arrays.stream(numbers).summaryStatistics();
        return (int) (stat.getSum() - stat.getMax() - stat.getMin());
    }
}
