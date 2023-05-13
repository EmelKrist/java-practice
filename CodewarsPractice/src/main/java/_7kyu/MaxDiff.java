package _7kyu;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

/**
 * https://www.codewars.com/kata/588a3c3ef0fbc9c8e1000095
 */
public class MaxDiff {
    public static int maxDiff(int[] lst) {
        if (lst.length <= 1) return 0;
        IntSummaryStatistics stat = IntStream.of(lst).summaryStatistics();
        return stat.getMax() - stat.getMin();
    }
}
