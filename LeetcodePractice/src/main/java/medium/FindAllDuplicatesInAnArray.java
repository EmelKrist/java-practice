package medium;

import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-all-duplicates-in-an-array/
 */
public class FindAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new LinkedList<>();
        cyclicSort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - 1 != i) duplicates.add(nums[i]);
        }

        return duplicates;
    }

    private void cyclicSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] == nums[correct]) {
                i++;
            } else {
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            }
        }
    }
}
