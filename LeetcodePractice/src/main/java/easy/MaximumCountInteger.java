package easy;

/**
 * https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer
 */
public class MaximumCountInteger {
    public int maximumCount(int[] nums) {
        int positive = binarySearch(nums, 0);
        int negative = nums.length - binarySearch(nums, 1);
        return Math.max(positive, negative);
    }

    private int binarySearch(int[] array, int target) {
        int left = 0, right = array.length;
        while (left < right) {
            int middle = (right + left) / 2;
            if (array[middle] >= target) right = middle;
            else left = middle + 1;
        }
        return left;
    }
}
