package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Stack<Character> parentheses = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                parentheses.push(')');
            } else if (c == '{') {
                parentheses.push('}');
            } else if (c == '[') {
                parentheses.push(']');
            } else if (parentheses.isEmpty() || parentheses.pop() != c) return false;
        }
        return parentheses.isEmpty();
    }
}
