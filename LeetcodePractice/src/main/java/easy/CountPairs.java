package easy;

import java.util.List;

/**
 * https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target
 */
public class CountPairs {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.size() - 1; i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) count++;
            }
        }
        return count;
    }
}
