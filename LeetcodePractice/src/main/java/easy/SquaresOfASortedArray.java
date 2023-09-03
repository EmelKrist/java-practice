package easy;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length, index = len - 1,
                left = 0, right = len - 1;
        int[] result = new int[len];

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }

            index--;
        }

        return result;
    }
}
