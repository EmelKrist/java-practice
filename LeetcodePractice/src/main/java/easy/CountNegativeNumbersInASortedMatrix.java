package easy;

/**
 * https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix
 */
public class CountNegativeNumbersInASortedMatrix {
    public static int countNegatives(int[][] grid) {
        int countNegativesNumbers = 0;
        int rowLen = grid[0].length;
        for (int[] row : grid) {
            int index = 0;
            for (int i = 0; i < rowLen; i++) {
                if (row[i] < 0) {
                    countNegativesNumbers += rowLen - i;
                    break;
                }
            }
        }
        return countNegativesNumbers;
    }
}
