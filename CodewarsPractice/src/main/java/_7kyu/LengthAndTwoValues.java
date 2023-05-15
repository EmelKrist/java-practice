package _7kyu;

import java.util.stream.IntStream;

/**
 * https://www.codewars.com/kata/62a611067274990047f431a8
 */
public class LengthAndTwoValues {
    public static String[] alternate(int n, String firstValue, String secondValue) {
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i+=2) {
            arr[i] = firstValue;
            if ((i + 1) != arr.length) arr[i + 1] = secondValue;
        }
        return arr;
    }

    public static String[] alternateAlter(int n, String firstValue, String secondValue) {
        return IntStream.range(0, n).mapToObj(i -> i % 2 == 0 ? firstValue : secondValue).toArray(String[]::new);
    }
}
