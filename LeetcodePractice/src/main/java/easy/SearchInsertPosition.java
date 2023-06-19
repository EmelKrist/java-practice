package easy;

/**
 * https://leetcode.com/problems/search-insert-position/
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
            if (nums[i] < target) index = i + 1;
        }
        return index;
    }

    public int searchInsertAlter(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start >= end) {
            int mid = start + (start - end) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return start;
    }
}
