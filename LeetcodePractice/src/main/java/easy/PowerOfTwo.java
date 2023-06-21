package easy;

/**
 * https://leetcode.com/problems/power-of-two/
 */
public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        while (n != 1) {
            if (n % 2 != 0 && n != 1) return false;
            n /= 2;
        }
        return true;
    }

    public boolean isPowerOfTwoAlter(int n) {
        return n > 0 && Integer.lowestOneBit(n) == n;
    }

}
