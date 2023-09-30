package medium;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/find-right-interval/
 */
public class FindRightInterval {
    public int[] findRightInterval(int[][] intervals) {
        int[] result = new int[intervals.length];
        PriorityQueue<Interval> maxStartHeap = new PriorityQueue<>((a, b) -> (b.start - a.start));
        PriorityQueue<Interval> maxEndHeap = new PriorityQueue<>((a, b) -> (b.end - a.end));

        for(int i = 0; i < intervals.length; i++) {
            maxStartHeap.add(new Interval(intervals[i][0], intervals[i][1], i));
            maxEndHeap.add(new Interval(intervals[i][0], intervals[i][1], i));
        }

        while (!maxEndHeap.isEmpty()) {
            Interval maxEndInterval = maxEndHeap.poll();
            result[maxEndInterval.index] = -1;

            if (!maxStartHeap.isEmpty() && (maxStartHeap.peek().start >= maxEndInterval.end)) {
                Interval maxStart = maxStartHeap.poll();

                while (!maxStartHeap.isEmpty() && (maxStartHeap.peek().start >= maxEndInterval.end)) {
                    maxStart = maxStartHeap.poll();
                }

                result[maxEndInterval.index] = maxStart.index;
                maxStartHeap.add(maxStart);
            }
        }

        return result;
    }


    private class Interval {
        int start;
        int end;
        int index;

        public Interval(int start, int end, int index) {
            this.start = start;
            this.end = end;
            this.index = index;
        }
    }
}
