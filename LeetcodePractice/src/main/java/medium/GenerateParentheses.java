package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/generate-parentheses/
 */
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        recuse(result, 0, 0, "", n);
        return result;
    }

    private void recuse(List<String> result, int left, int right, String str, int n) {
        if (str.length() == n * 2)
            result.add(str);

        if (left < n)
            recuse(result, left + 1, right, str + "(", n);

        if (right < left)
            recuse(result, left, right + 1, str + ")", n);

    }
}
