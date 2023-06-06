package _8kyu;

import java.util.stream.IntStream;

/**
 * https://www.codewars.com/kata/57f6ad55cca6e045d2000627
 */
public class ToSquareOrNotToSquare {
    public static int[] squareOrSquareRoot(int[] array) {
        return IntStream.of(array).map(i -> Math.sqrt(i) % 1 == 0.0 ? (int) Math.sqrt(i) : i * i).toArray();
    }

    public static int[] squareOrSquareRootAlter(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) % 1 == 0) array[i] = (int) Math.sqrt(array[i]);
            else array[i] = array[i] * array[i];
        }
        return array;
    }
}
