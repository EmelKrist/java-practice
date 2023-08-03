package easy;

/**
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/
 */
public class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        StringBuilder reverseWords = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && i <= s.length() - 1) {
                word.append(s.charAt(i));
            }

            if (s.charAt(i) == ' ' || i == s.length() - 1) {
                for (int j = word.length() - 1; j >= 0; j--) {
                    reverseWords.append(word.charAt(j));
                }
                if (s.charAt(i) == ' ') reverseWords.append(" ");
                word.setLength(0);
            }
        }
        return reverseWords.toString();
    }
}
