package easy;

/**
 * https://leetcode.com/problems/to-lower-case/
 */
public class ToLowerCase {
    public String toLowerCase(String s) {
        StringBuilder lowerCase = new StringBuilder();
        for (char c : s.toCharArray()){
            lowerCase.append(Character.isUpperCase(c) ? Character.toLowerCase(c) : c);
        }
        return lowerCase.toString();
    }

    public String toLowerCaseAlter(String s) {
        return s.toLowerCase();
    }
}
