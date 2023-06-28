package easy;

/**
 * https://leetcode.com/problems/detect-capital/
 */
public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        char[] letters = word.toCharArray();
        if (word.length() >= 2 && Character.isUpperCase(letters[0]) && Character.isUpperCase(letters[1])) {
            for (int i = 2; i < letters.length; i++) {
                if (Character.isLowerCase(letters[i])) return false;
            }
        } else if (word.length() > 1 && (Character.isUpperCase(letters[0]) || Character.isLowerCase(letters[0]))) {
            for (int i = 1; i < letters.length; i++) {
                if (Character.isUpperCase(letters[i])) return false;
            }
        }

        return true;
    }

    public boolean detectCapitalUseAlter(String word) {
        int upperCaseLetters = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) upperCaseLetters++;
        }
        if (upperCaseLetters == 0 || upperCaseLetters == word.length()) return true;
        if (upperCaseLetters == 1 && Character.isUpperCase(word.charAt(0))) return true;
        return false;
    }
}
