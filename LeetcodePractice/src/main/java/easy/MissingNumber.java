package easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/missing-number/
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) return i;
        }
        return nums.length;
    }

    public int missingNumberAlter(int[] nums) {
        int n = nums.length;
        int[] cnt = new int[n + 1];
        for (int i : nums) {
            cnt[i]++;
        }
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] == 0) return i;
        }
        return -1;
    }
}
