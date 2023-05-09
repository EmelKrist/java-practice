package easy;

/**
 * https://leetcode.com/problems/palindrome-number/
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int x2 = x, reverse = 0, remainder;
        while (x2 != 0) {
            remainder = x2 % 10;
            reverse = reverse * 10 + remainder;
            x2 /= 10;
        }
        return x == reverse;
    }

    public boolean isPalindromeAlter(int x) {
        if (x < 10) return x >= 0;
        else {
            String strNumber = String.valueOf(x);
            int left = 0, right = strNumber.length() - 1;
            while (left < right) {
                if (strNumber.charAt(left++) != strNumber.charAt(right--)) return false;
            }
        }
        return true;
    }
}
