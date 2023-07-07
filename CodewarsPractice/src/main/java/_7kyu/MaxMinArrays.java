package _7kyu;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/5a090c4e697598d0b9000004
 */
public class MaxMinArrays {
    public static int[] solve(int[] arr) {
        Arrays.sort(arr);
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = i % 2 == 0 ? arr[arr.length - 1 - i / 2] : arr[i / 2];
        }
        return result;
    }
}
