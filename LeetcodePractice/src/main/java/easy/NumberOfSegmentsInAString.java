package easy;

/**
 * https://leetcode.com/problems/number-of-segments-in-a-string/
 */
public class NumberOfSegmentsInAString {
    public int countSegments(String s) {
        if (s.isBlank()) return 0;
        s = s.replaceAll("\\s{2,}", " ").trim();
        int countOfSegments = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') countOfSegments++;
        }
        return countOfSegments;
    }

    public int countSegmentsAlter(String s) {
        if (s.isBlank()) return 0;
        return s.trim().replaceAll("\\s{2,}", " ").split(" ").length;
    }

    public int countSegmentsAlterTwo(String s) {
        if (s.length() == 0) return 0;
        int c = 0, res = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != ' ') c++;
            if (s.charAt(i) == ' ' && s.charAt(i - 1) != ' ') res++;
        }
        if (s.charAt(0) != ' ') c++;
        if (c == 0 && res == 0) return 0;
        if (s.charAt(s.length() - 1) != ' ') res++;
        return res;
    }
}
