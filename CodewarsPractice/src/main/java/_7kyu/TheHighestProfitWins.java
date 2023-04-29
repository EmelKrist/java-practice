package _7kyu;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/559590633066759614000063
 */
public class TheHighestProfitWins {
    public static int[] minMax(int[] arr) {
       return new int[] {Arrays.stream(arr).min().getAsInt(), Arrays.stream(arr).max().getAsInt()};
    }

    public static int[] minMaxAlter(int[] arr) {
        Arrays.sort(arr);
        return new int[] {arr[0], arr[arr.length - 1]};
    }

    public static int[] minMaxAlterTwo(int[] arr) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        for (int i : arr){
            if (i < min) min = i;
            if (i > max) max = i;
//            min = Math.min(i, min);
//            max = Math.max(i, max);
        }
        return new int[] {min, max};
    }
}
