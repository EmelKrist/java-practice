package easy;

/**
 * https://leetcode.com/problems/isomorphic-strings
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] sCharsMap = new int[200];
        int[] tCharsMap = new int[200];

        for (int i = 0; i < s.length(); i++) {
            if (sCharsMap[s.charAt(i)] != tCharsMap[t.charAt(i)]) return false;
            sCharsMap[s.charAt(i)] = i + 1;
            tCharsMap[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
