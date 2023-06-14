package easy;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        return new int[0];
    }
    public int[] twoSumAlter(int[] nums, int target) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j + i < nums.length; j++) {
                if (nums[j] + nums[j + i] == target) return new int[]{j, j + i};
            }
        }
        return new int[0];
    }
}
