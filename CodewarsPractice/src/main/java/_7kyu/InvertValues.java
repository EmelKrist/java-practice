package _7kyu;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/5899dc03bc95b1bf1b0000ad
 */
public class InvertValues {
    public static int[] invert(int[] array) {
        return Arrays.stream(array).map(i -> -i).toArray();
    }
}
