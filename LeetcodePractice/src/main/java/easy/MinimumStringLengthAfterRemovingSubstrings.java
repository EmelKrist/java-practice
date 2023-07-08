package easy;

import java.util.ArrayDeque;

/**
 *  https://leetcode.com/problems/minimum-string-length-after-removing-substrings/solutions/3546721/java-easy-solution-8-lines/
 */
public class MinimumStringLengthAfterRemovingSubstrings {
    public int minLength(String s) {
        while (s.indexOf("AB") != -1 || s.indexOf("CD") != -1) {
            int idxAB = s.indexOf("AB");
            int idxCD = s.indexOf("CD");

            if (idxAB != -1) {
                s = s.substring(0, idxAB) + s.substring(idxAB + 2, s.length());
            } else {
                s = s.substring(0, idxCD) + s.substring(idxCD + 2, s.length());
            }
        }
        return s.length();
    }

    public int minLengthAlter(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'B' && !stack.isEmpty() && stack.peek() == 'A') stack.pop();
            else if (c == 'D' && !stack.isEmpty() && stack.peek() == 'C') stack.pop();
            else stack.push(c);
        }
        return stack.size();
    }
}
