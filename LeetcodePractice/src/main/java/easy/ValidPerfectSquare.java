package easy;

/**
 * https://leetcode.com/problems/valid-perfect-square/
 */
public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int low = 1, high = num;
        while (low <= high) {
            long mid = (low + high) / 2;
            long square = mid * mid;
            if (square == num) {
                return true;
            } else if (square > num){
                high = (int) mid - 1;
            } else {
                low = (int) mid + 1;
            }
        }

        return false;
    }
}
