package easy;

/**
 * https://leetcode.com/problems/find-the-difference/
 */
public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        StringBuilder sb = new StringBuilder(t);
        for (int i = 0; i < s.length(); i++) {
            sb.deleteCharAt(sb.indexOf(String.valueOf(s.charAt(i))));
        }
        return sb.charAt(0);
    }

    public char findTheDifferenceAlter(String s, String t) {
        int[] frec = new int[26];
        for (char c : t.toCharArray())
            frec[c - 'a']++;

        for (char c : s.toCharArray())
            frec[c - 'a']--;

        for (int i = 0; i < frec.length; i++) {
            if (frec[i] != 0) return (char) ('a' + i);
        }
        return '\0';
    }
}
