package medium;

import java.util.*;

/**
 * https://leetcode.com/problems/least-number-of-unique-integers-after-k-removals
 */
public class LeastNumberOfUniqueIntegersAfterKRemovals {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> numberAppearances = new HashMap<>();
        for (int number : arr) {
            numberAppearances.put(number, numberAppearances.getOrDefault(number, 0) + 1);
        }

        List<Integer> appearances = new ArrayList<>(numberAppearances.values());
        Collections.sort(appearances);
        for (int i = 0; i < k; i++) {
            int countFirst = appearances.get(0);
            if (countFirst > 0) appearances.set(0, countFirst - 1);
            if (appearances.get(0) == 0) appearances.remove(0);
            if (appearances.size() == 0) return 0;
        }
        return appearances.size();
    }

    public int findLeastNumOfUniqueIntsAlter(int[] arr, int k) {
        HashMap<Integer, Integer> numberAppearances = new HashMap<>();
        for (int number : arr) {
            numberAppearances.put(number, numberAppearances.getOrDefault(number, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(numberAppearances.values());
        while (k > 0) {
            k -= pq.poll();
        }
        return k < 0 ? pq.size() + 1 : pq.size();
    }
}
