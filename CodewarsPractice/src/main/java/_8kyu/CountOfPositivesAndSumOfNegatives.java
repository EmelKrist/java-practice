package _8kyu;

/**
 * https://www.codewars.com/kata/576bb71bbbcf0951d5000044
 */
public class CountOfPositivesAndSumOfNegatives {
    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) return new int[] {};
        int count = 0, sum = 0;
        for (int i : input) {
            if (i > 0) count++;
            else sum+=i;
        }
        return new int[] {count, sum};
    }
}
