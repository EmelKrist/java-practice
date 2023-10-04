package medium;

import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/
 */
public class KthSmallestElementInASortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> values = new PriorityQueue<>();
        for (int[] row : matrix) {
            for (int col : row) {
                values.offer(col);
            }
        }
        while (k > 0) {
            values.poll();
            k--;
        }
        return values.peek();
    }
}
