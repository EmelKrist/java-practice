package easy;

/**
 * https://leetcode.com/problems/binary-search/
 */
public class BinarySearch {
    public int search(int[] nums, int target) {
        int lowerBound = 0,  upperBound = nums.length - 1, mid;
        while (lowerBound <= upperBound) {
            mid = (lowerBound + upperBound) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) lowerBound = mid + 1;
            else upperBound = mid - 1;
        }
        return -1;
    }
}
