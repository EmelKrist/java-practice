package _5kyu;

import java.util.Arrays;
import java.util.List;

public class BestTravel {
    private static Integer bestSum;

    public static void main(String[] args) {
        System.out.println(chooseBestSum(163, 3, Arrays.asList(50)));
    }

    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
        bestSum = 0;
        getSumOfCombinations(t, k, ls, 0, bestSum);
        return bestSum != 0 ? bestSum : null;
    }

    private static void getSumOfCombinations(int t, int k, List<Integer> ls, int position, int currentSum) {
        if (currentSum > t) return;
        if (k == 0) {
            bestSum = Math.max(bestSum, currentSum);
            return;
        }
        for (int pos = position; pos < ls.size(); pos++){
            getSumOfCombinations(t, k - 1, ls,pos + 1 , currentSum + ls.get(pos));
        }
    }
}
