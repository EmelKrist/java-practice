package easy;

/**
 * https://leetcode.com/problems/move-zeroes/
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int idx = 0, countZeros = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[idx++] = nums[i];
            } else countZeros++;
        }
        while (countZeros != 0) {
            nums[idx++] = 0;
            countZeros--;
        }
    }
}
