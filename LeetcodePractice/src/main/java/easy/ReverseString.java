package easy;

/**
 * https://leetcode.com/problems/reverse-string/
 */
public class ReverseString {
    public void reverseString(char[] s) {
        int i = 0, j = s.length - 1;
        while (i < j) {
            char temp = s[i];
            s[i++] = s[j];
            s[j--] = temp;
        }
    }

    public void reverseStringAlter(char[] s) {
         char[] reverseString = new char[s.length];
         for (int i = 0; i < s.length; i++) {
             reverseString[i] = s[s.length - i - 1];
         }
         for (int i = 0; i < s.length; i++) {
             s[i] = reverseString[i];
         }
    }
}
