package easy;

/**
 * https://leetcode.com/problems/binary-search/
 */
public class BinarySearch {
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int midIndex = (left + right) / 2;
            int midElem = nums[midIndex];
            if (midElem == target) {
                return midIndex;
            } else if (midElem > target) {
                right = midIndex - 1;
            } else {
                left = midIndex + 1;
            }
        }
        return -1;
    }
}
