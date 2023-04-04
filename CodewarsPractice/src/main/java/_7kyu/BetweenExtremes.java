package _7kyu;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

/**
 * https://www.codewars.com/kata/56d19b2ac05aed1a20000430
 */
public class BetweenExtremes {
    public static int betweenExtremes(int[] numbers) {
       return IntStream.of(numbers).max().getAsInt() - IntStream.of(numbers).min().getAsInt();
    }

    public static int betweenExtremesAlter(int[] numbers) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i: numbers){
            if (i > max) max = i;
            if (i < max) min = i;
        }

        return max - min;
    }

    public static int betweenExtremesAlterTwo(int[] numbers) {
        IntSummaryStatistics stats = IntStream.of(numbers).summaryStatistics();
        return stats.getMax() - stats.getMin();
    }
}
