package easy;

import java.util.List;

public class CheckIfAStringIsAnAcronymOfWords {
    public boolean isAcronym(List<String> words, String s) {
        if (words.size() != s.length()) return false;
        int left = 0, right = s.length() - 1;
        while (left <= right) {
            if (words.get(left).charAt(0) != s.charAt(left)) return false;
            if (left == right) break;
            if (words.get(right).charAt(0) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
