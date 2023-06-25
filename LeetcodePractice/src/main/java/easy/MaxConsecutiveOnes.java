package easy;

/**
 * https://leetcode.com/problems/max-consecutive-ones/
 */
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, temp = 0;
        for (int i : nums) {
            if (i == 1) temp++;
            else {
                if (max < temp) max = temp;
                temp = 0;
            }
        }
        if (max < temp) max = temp;
        return max;
    }
}
