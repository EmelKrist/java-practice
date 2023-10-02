package medium;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/single-number-ii/
 */
public class SingleNumberII {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> mapOfCounts = new HashMap<>();
        for (int num : nums) {
            mapOfCounts.put(num, mapOfCounts.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> map : mapOfCounts.entrySet()) {
            if (map.getValue() == 1) {
                return map.getKey();
            }
        }
        return -1;
    }
}
