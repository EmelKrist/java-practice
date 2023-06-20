package easy;

/**
 * https://leetcode.com/problems/valid-palindrome/
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String convertingString = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return convertingString.equals(new StringBuilder(convertingString).reverse().toString());
    }

    public boolean isPalindromeAlter(String s) {
        int len = s.length(), start = 0, end = len - 1;
        char chStart, chEnd;
        while (start < end) {
            chStart = s.charAt(start);
            chEnd = s.charAt(end);
            if (!Character.isLetterOrDigit(chStart)) {
                start++;
            } else if (!Character.isLetterOrDigit(chEnd)) {
                end--;
            } else if (Character.toLowerCase(chStart) == Character.toLowerCase(chEnd)) {
                start++; end--;
            } else {
                return false;
            }
        }
        return true;
    }
}
