package _8kyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * https://www.codewars.com/kata/5a34b80155519e1a00000009
 */
public class MultipleOfIndex {
    public static int[] multipleOfIndex(int[] array) {
        List<Integer> result = new ArrayList<>();
        if (array[0] == 0) result.add(0);
        for (int i = 1; i < array.length; i++) {
            if (Math.abs(array[i] % i) == 0) result.add(array[i]);
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    public static int[] multipleOfIndexAlter(int[] array) {
        return IntStream.range(0, array.length)
                .filter(i -> (i == 0 && array[i] == 0) || (i != 0 && array[i] % i == 0))
                .map(i -> array[i]).toArray();
    }
}
