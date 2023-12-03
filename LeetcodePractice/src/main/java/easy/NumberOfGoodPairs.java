package easy;

/**
 * https://leetcode.com/problems/number-of-good-pairs/
 */
public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int numIdenticalPairs = 0;
        int i = 0, j = 0;
        int len = nums.length;

        while (i < len) {
            j = i + 1;
            while (j < len) {
                if (nums[i] == nums[j]) numIdenticalPairs++;
                j++;
            }
            i++;
        }

        return numIdenticalPairs;
    }
}
