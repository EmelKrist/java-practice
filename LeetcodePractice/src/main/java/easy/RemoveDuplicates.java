package easy;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
