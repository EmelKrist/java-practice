package easy;

/**
 * https://leetcode.com/problems/build-array-from-permutation/
 */
public class BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = nums[nums[i]];
        }
        return array;
    }
}
