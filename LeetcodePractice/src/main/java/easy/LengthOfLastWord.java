package easy;

/**
 * https://leetcode.com/problems/length-of-last-word/
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String string = s.trim();
        for (int i = string.length() - 1; i >= 0; i--) {
            if (string.charAt(i) == ' ') return string.length() - i - 1;
        }
        return string.length();
    }

    public int lengthOfLastWordAlter(String s) {
        int length = 0; boolean startCount = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') startCount = true;
            if (startCount) {
                if (s.charAt(i) == ' ') break;
                length++;
            }
        }
        return length;
    }

    public int lengthOfLastWordAlterTwo(String s) {
        String[] words = s.trim().split(" ");
        return words[words.length - 1].length();
    }
}
