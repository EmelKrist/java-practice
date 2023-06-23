package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/majority-element/
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> appears = new HashMap<>();
        for (int i : nums) {
            appears.put(i, appears.getOrDefault(i, 0) + 1);
            if (appears.get(i) > nums.length / 2) return i;
        }
        return 0;
    }

    /**
     * Bad practise (slowly)
     */
    public int majorityElementAlter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i : nums) {
            int count = 0;
            for (int j : nums) {
                if (i == j) count++;
            }
            if (count > n / 2) return i;
        }
        return -1;
    }
}
