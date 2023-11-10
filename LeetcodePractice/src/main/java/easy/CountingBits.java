package easy;

/**
 * https://leetcode.com/problems/counting-bits/
 */
public class CountingBits {
    public int[] countBits(int n) {
        int[] countBits = new int[n + 1];
        countBits[0] = 0;

        for (int i = 1; i <= n; i++) {
            int count = 0;
            int num = i;
            while (num > 0) {
                count++;
                num = num & (num - 1);
            }
            countBits[i] = count;
        }

        return countBits;
    }
}
