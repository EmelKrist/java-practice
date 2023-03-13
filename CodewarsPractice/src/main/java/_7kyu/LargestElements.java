package _7kyu;

import java.util.*;
import java.util.stream.IntStream;

/*
https://www.codewars.com/kata/53d32bea2f2a21f666000256
 */
public class LargestElements {
    public static int[] largest(int n, int[] arr) {
        Arrays.sort(arr);
        int[] result = new int[n];
        int j = n - 1;
        for (int i = arr.length - 1; i >= arr.length - n; i--){
            result[j--] = arr[i];
        }
        return result;
    }

    public static int[] largestAlter(int n, int[] arr) {
        Arrays.sort(arr);
        return Arrays.copyOfRange(arr, arr.length - n, arr.length);
    }

    public static int[] largestAlterTwo(int n, int[] arr) {
        return IntStream.of(arr).sorted().skip(arr.length - n).toArray();
    }

}
