package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-and-replace-pattern/
 */
public class FindAndReplacePattern {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> matches = new ArrayList<>();
        for (String word : words) {
            if (isMatch(word, pattern)) matches.add(word);
        }
        return matches;
    }

    private boolean isMatch(String word, String pattern) {
        for (int i = 0; i < word.length(); i++) {
            if (word.indexOf(word.charAt(i)) != pattern.indexOf(pattern.charAt(i))) return false;
        }
        return true;
    }
}
