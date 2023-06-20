package easy;

/**
 * https://leetcode.com/problems/climbing-stairs/
 */
public class ClimbingStairs {

    /**
     * there are two ways to get to the nth stair. From the (n-1)th or the (n-2)th stair.
     *
     * Therefore the amount of ways to get to the nth stair is the amount of ways you can get to the
     * (n-1)th stair plus the amount of ways you can get to the (n-2)th stair.
     *
     * You can think of them as the only two gateways to your desired stair, so your options for getting
     * to your desired stair are limited to the ways of getting to the only two entrypoints of that stair.
     */

    public int climbStairs(int n) {
        if (n <= 2) return n;

        int x = 1, y = 2;
        for (int i = 2; i < n; i++) {
            int temp = x;
            x = y;
            y = temp + x;
        }
        return y;
    }
}
