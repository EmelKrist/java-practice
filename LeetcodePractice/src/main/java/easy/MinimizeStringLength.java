package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/minimize-string-length/
 */
public class MinimizeStringLength {
    public int minimizedStringLength(String s) {
        Set<Character> setOfLetters = new HashSet<>();
        for (char c : s.toCharArray()) {
            setOfLetters.add(c);
        }
        return setOfLetters.size();
    }

    public int minimizedStringLengthAlter(String s) {
        var map = new boolean[26];
        var ans = 0;
        for (var c : s.toCharArray()) map[c - 'a'] = true;
        for (var m : map) if (m) ans++;
        return ans;
    }
}
