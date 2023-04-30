package _7kyu;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * https://www.codewars.com/kata/5a905c2157c562994900009d
 */
public class ProductArray {
    public static long[] productArray(int[] numbers) {
        long[] productArray = new long[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            long productAll = 1;
            for (int j = 0; j < numbers.length; j++) {
                if (j != i) productAll *= numbers[j];
            }
            productArray[i] = productAll;
        }
        return productArray;
    }

    public static long[] productArrayAlter(int[] numbers) {
        long productAll = IntStream.of(numbers).asLongStream().reduce(1, (a, b) -> a * b);
        return IntStream.of(numbers).mapToLong(i -> productAll / i).toArray();
    }

    public static long[] productArrayAlterTwo(int[] numbers) {
        long[] productArray = new long[numbers.length];
        long productAll = 1;

        for (int i : numbers) {
            productAll *= i;
        }

        for (int i = 0; i < productArray.length; i++) {
            productArray[i] = productAll / numbers[i];
        }

        return productArray;
    }
}
