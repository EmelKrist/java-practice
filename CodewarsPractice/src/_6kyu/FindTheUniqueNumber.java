package _6kyu;

import java.util.Arrays;

/*
https://www.codewars.com/kata/585d7d5adb20cf33cb000235
 */
public class FindTheUniqueNumber {
    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }));
        System.out.println(findUniqAlter(new double[]{ 1, 1, 1, 2, 1, 1 }));
    }

    public static double findUniq(double arr[]) {
        Arrays.sort(arr);
        if (arr[0] == arr[1]) return arr[arr.length - 1];
        return arr[0];
        //return arr[0] == arr[1] ? arr[arr.length - 1] : arr[0];
    }

    public static double findUniqAlter(double arr[]) {
        double repeatable = arr[0] == arr[1] ? arr[0] : (arr[0] == arr[2] ? arr[0] : arr[1]);
        for (double i : arr) {
            if (i != repeatable) return i;
        }
        return 0;
    }
}
