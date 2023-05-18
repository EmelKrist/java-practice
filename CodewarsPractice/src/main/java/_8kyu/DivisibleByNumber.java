package _8kyu;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/55edaba99da3a9c84000003b
 */
public class DivisibleByNumber {
    public static int[] divisibleBy(int[] numbers, int divider) {
        return Arrays.stream(numbers).filter(i -> i % divider == 0).toArray();
    }
}
