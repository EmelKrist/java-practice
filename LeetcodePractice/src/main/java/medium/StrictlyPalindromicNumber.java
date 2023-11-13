package medium;

/**
 * https://leetcode.com/problems/strictly-palindromic-number/
 */
public class StrictlyPalindromicNumber {
    public boolean isStrictlyPalindromic(int n) {
        for (int i = 2; i <= n - 2; i++) {
            String numberInBase = convertToStringBase(n, i);
            if (!isPalindrome(numberInBase)) return false;
        }
        return true;
    }

    private String convertToStringBase(int number, int base) {
        StringBuilder stringBase = new StringBuilder();
        while (number != 0) {
            int reminder = number % base;
            number /= base;
            stringBase.insert(0, reminder);
        }
        return stringBase.toString();
    }

    private boolean isPalindrome(String number) {
        int left = 0, right = number.length() - 1;
        while (left < right) {
            if (number.charAt(left) != number.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }


    public boolean isStrictlyPalindromicAlter(int n) {
        return false;
    }

}
