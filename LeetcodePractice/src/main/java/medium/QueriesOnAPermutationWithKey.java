package medium;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * https://leetcode.com/problems/queries-on-a-permutation-with-key/
 */
public class QueriesOnAPermutationWithKey {
    public int[] processQueries(int[] queries, int m) {
        int qLength = queries.length;
        int[] positions = new int[qLength];
        int[] p = IntStream.rangeClosed(1, m).toArray();

        for (int i = 0; i < qLength; i++) {
            int query = queries[i];
            int pIndex = 0;

            while (p[pIndex] != query) {
                pIndex++;
            }
            positions[i] = pIndex;

            toFirstPosition(p, pIndex);
        }

        return positions;
    }

    private int[] toFirstPosition(int[] permutations, int elemIndex) {
        int element = permutations[elemIndex];

        while (elemIndex > 0) {
            permutations[elemIndex] = permutations[elemIndex - 1];
            elemIndex--;
        }

        permutations[0] = element;
        return permutations;
    }
}
