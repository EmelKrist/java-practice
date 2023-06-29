package easy;

/**
 * https://leetcode.com/problems/repeated-substring-pattern/
 */
public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for (int i = len / 2; i >= 1; i--) {
            if (len % i == 0) {
                int countSub = len / i;
                String sub = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < countSub; j++) {
                    sb.append(sub);
                }
                if (sb.toString().equals(s)) return true;
            }
        }
        return false;
    }
    public boolean repeatedSubstringPatternAlter(String s) {
        for (int i = 0; i < s.length() / 2 + 1; i++) {
            if (s.replaceAll(s.substring(0, i), "").equals("")) return true;
        }
        return false;
    }
}
