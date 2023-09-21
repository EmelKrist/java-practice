package easy;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * https://leetcode.com/problems/remove-element/
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) nums[index++] = nums[i];
        }
        return index;
    }
}
