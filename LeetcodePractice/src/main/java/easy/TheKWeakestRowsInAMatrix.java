package easy;

import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
 */
public class TheKWeakestRowsInAMatrix {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> minheap = new PriorityQueue<>((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        for (int[] row : mat) {
            int low = 0, high = row.length;
            while (low < high) {
                int mid = (low + high) >> 1;
                if (row[mid] == 0) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }
            minheap.offer(new int[]{low, minheap.size()});
        }

        int[] kWeakestRowArray = new int[k];
        for (int i = 0; i < k; i++) {
            kWeakestRowArray[i] = minheap.poll()[1];
        }

        return kWeakestRowArray;
    }
}
