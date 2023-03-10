package _8kyu;

import java.util.Arrays;

/*
https://www.codewars.com/kata/515e271a311df0350d00000f
 */
public class SquareSum {
    public int squareSum(int[] n) {
        return Arrays.stream(n).map(i -> i * i).sum();
    }

    public int squareSumAlter(int[] n) {
        int sum = 0;
        for (int num : n) {
            sum += num * num;
        }
        return sum;
    }


}
