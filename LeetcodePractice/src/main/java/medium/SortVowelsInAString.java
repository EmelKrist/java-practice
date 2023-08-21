package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortVowelsInAString {
    public String sortVowels(String s) {
        String vowels = "aouieAOUIE";
        StringBuilder vowelsInString = new StringBuilder();
        var tempArray = s.toCharArray();
        Arrays.sort(tempArray);
        for (char c : tempArray) {
            if (vowels.contains(Character.toString(c))) vowelsInString.append(c);
        }

        StringBuilder result = new StringBuilder(s);
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(Character.toString(s.charAt(i)))) {
                result.setCharAt(i, vowelsInString.charAt(j++));
            }
        }

        return result.toString();
    }

    public String sortVowelsAlter(String s) {
        List<Character> vowelsInString = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (isVowel(c)) vowelsInString.add(c);
        }
        Collections.sort(vowelsInString);

        StringBuilder result = new StringBuilder();
        int indexOfList = 0;
        for (char c : s.toCharArray()) {
            if (isVowel(c)) result.append(vowelsInString.get(indexOfList++));
            else result.append(c);
        }

        return result.toString();
    }

    private boolean isVowel (char c) {
        return c == 'a' || c == 'o' || c == 'u' || c == 'i' || c == 'e'
                || c == 'A' || c == 'O' || c == 'U' || c == 'I' || c == 'E';
    }

}
