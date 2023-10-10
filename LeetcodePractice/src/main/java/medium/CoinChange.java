package medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/coin-change/
 */
public class CoinChange {
    public static int coinChange(int[] coins, int amount) {
        if (coins == null || coins.length == 0) return -1;
        if (amount == 0) return 0;

        int n = coins.length, max = amount + 1;
        int[] knapsack = new int[max];
        Arrays.fill(knapsack, max);
        knapsack[0] = 0;

        for (int i = 1; i <= n; i++) {
            int coin = coins[i - 1];
            for (int j = 0; j <= amount; j++) {
                if (coin <= j) {
                    knapsack[j] = Math.min(knapsack[j], knapsack[j - coin] + 1);
                }
            }
        }
        return knapsack[amount] >= max ? -1 : knapsack[amount];
    }
}
