package easy;

/**
 * https://leetcode.com/problems/arranging-coins
 */
public class ArrangingCoins {
    public int arrangeCoins(int n) {
        int left = 0, right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long temp = ((long) mid * (mid + 1)) / 2;
            if (temp > n) {
                right = mid - 1;
            } else if (temp < n) {
                left = mid + 1;
            } else {
                return mid;
            }
        }

        return right;
    }
}
