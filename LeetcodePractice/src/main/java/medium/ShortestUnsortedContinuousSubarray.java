package medium;

/**
 * https://leetcode.com/problems/shortest-unsorted-continuous-subarray
 */
public class ShortestUnsortedContinuousSubarray {
    public int findUnsortedSubarray(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < nums.length - 1 && nums[left] <= nums[left + 1]) {
            left++;
        }

        if (left == nums.length - 1) {
            return 0;
        }

        while (right > 0 && nums[right] >= nums[right - 1]) {
            right--;
        }

        int subarrayMax = Integer.MIN_VALUE;
        int subarrayMin = Integer.MAX_VALUE;

        for (int i = left; i <= right; i++) {
            subarrayMin = Math.min(nums[i], subarrayMin);
            subarrayMax = Math.max(nums[i], subarrayMax);
        }

        while (left > 0 && nums[left - 1] > subarrayMin) {
            left--;
        }

        while (right < nums.length - 1 && nums[right + 1] < subarrayMax) {
            right++;
        }

        return right - left + 1;
    }
}
