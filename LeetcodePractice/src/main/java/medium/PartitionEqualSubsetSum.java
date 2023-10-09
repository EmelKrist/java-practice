package medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/partition-equal-subset-sum/
 */
public class PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        int value = Arrays.stream(nums).sum();
        if (value % 2 == 1) {
            return false;
        }
        value /= 2;
        boolean[] knapsack = new boolean[value + 1];
        knapsack[0] = true;
        for (int num : nums) {
            for (int condition = value; condition >= num; condition--) {
                knapsack[condition] = knapsack[condition] || knapsack[condition - num];
            }
        }
        return knapsack[value];
    }
}
