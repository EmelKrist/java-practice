package _7kyu;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * https://www.codewars.com/kata/559cc2d2b802a5c94700000c
 */
public class HowManyConsecutiveNumbersAreNeeded {
    public static int consecutive(final int[] arr) {
        if (arr.length == 0 || arr.length == 1) return 0;
        int min = IntStream.of(arr).min().getAsInt();
        int max = IntStream.of(arr).max().getAsInt();

        int countNumbers = 0;
        for (int i = min + 1; i < max; i++) {
            int number = i;
            if (!IntStream.of(arr).anyMatch(n -> n == number)) countNumbers++;
        }
        return countNumbers;
    }

    public static int consecutiveAlter(final int[] arr) {
        if (arr.length == 0) return 0;
        Arrays.sort(arr);
        return arr[arr.length - 1] - arr[0] - arr.length + 1;
    }

    public static int consecutiveAlterTwo(final int[] arr) {
        return arr.length == 0 ? 0 :
                IntStream.of(arr).max().getAsInt() - IntStream.of(arr).min().getAsInt() - arr.length + 1;
    }
}
