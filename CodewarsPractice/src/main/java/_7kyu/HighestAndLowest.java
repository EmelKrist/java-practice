package _7kyu;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://www.codewars.com/kata/554b4ac871d6813a03000035
 */
public class HighestAndLowest {
    public static String highAndLow(String numbers) {
        return Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).max().getAsInt()
                + " " +
                Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).min().getAsInt();
    }

    public static String highAndLowAlter(String numbers) {
        var stat = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
        return stat.getMax() + " " + stat.getMin();
    }

    public static String highAndLowAlterTwo(String numbers) {
        List<Integer> list = Arrays.stream(numbers.split(" ")).map(Integer::parseInt).toList();
        return String.format("%s %s", Collections.max(list), Collections.min(list));
    }

    public static String highAndLowAlterThree(String numbers) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int currency;
        for (String i : numbers.split(" ")) {
            currency = Integer.parseInt(i);
            if (currency > max) max = currency;
            if (currency < min) min = currency;
        }
        return String.format("%s %s", max, min);
    }
}
