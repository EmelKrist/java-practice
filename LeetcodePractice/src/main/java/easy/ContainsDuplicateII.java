package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/contains-duplicate-ii/
 */
public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k == 0) return false;
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int integer = nums[i];
            if (hashMap.containsKey(integer) && i - hashMap.get(integer) <= k) return true;
            hashMap.put(integer, i);
        }
        return false;
    }
    public boolean containsNearbyDuplicateAlter(int[] nums, int k) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && Math.abs(i - j) <= k) return true;
            }
        }
        return false;
    }
}
