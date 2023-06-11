package easy;

import java.util.Arrays;
import java.util.HashSet;

/**
 * https://leetcode.com/problems/contains-duplicate/
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        int countDuplicates = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) countDuplicates++;
        }
        return countDuplicates != 0;
    }

    public boolean containsDuplicateAlter(int[] nums) {
        HashSet<Integer> withoutDuplicates = new HashSet<>();
        for (int i : nums){
            if (withoutDuplicates.contains(i)) return true;
            withoutDuplicates.add(i);
        }
        return false;
    }
}
