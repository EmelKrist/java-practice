package easy;

/**
 * https://leetcode.com/problems/concatenation-of-array/
 */
public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int[] concatNums = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            concatNums[i] = nums[i];
            concatNums[i + nums.length] = nums[i];
        }
        return concatNums;
    }

    public int[] getConcatenationAlter(int[] nums) {
        int[] concatNums = new int[nums.length * 2];
        System.arraycopy(nums, 0, concatNums, 0, nums.length);
        System.arraycopy(nums, 0, concatNums, nums.length, nums.length);
        return concatNums;
    }
}
