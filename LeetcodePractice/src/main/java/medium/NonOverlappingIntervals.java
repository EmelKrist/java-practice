package medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/non-overlapping-intervals/
 */
public class NonOverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> (a[1] - b[1]));
        int countOfErased = 0, currency = 0;

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[currency][1] > intervals[i][0]) countOfErased++;
            else currency = i;
        }

        return countOfErased;
    }
}
