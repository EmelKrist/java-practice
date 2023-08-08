package medium;

/**
 * https://leetcode.com/problems/reverse-integer/
 */
public class ReverseInteger {
    public int reverse(int x) {
        int integer = Math.abs(x);
        long reverseInteger = 0;
        while (integer > 0) {
            reverseInteger = reverseInteger * 10 + integer % 10;
            integer /= 10;
        }
        if (x < 0) reverseInteger *= -1;
        if (reverseInteger < Integer.MIN_VALUE || reverseInteger > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) reverseInteger;
    }
}
