package medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/sort-colors/
 */
public class SortColors {
    public static void sortColors(int[] nums) {
        int len = nums.length;
        int low = 0, mid = 0, high = len - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    public static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
