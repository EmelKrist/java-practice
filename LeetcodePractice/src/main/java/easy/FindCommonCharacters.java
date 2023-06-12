package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-common-characters/
 */
public class FindCommonCharacters {
    public List<String> commonChars(String[] words) {
        List<String> commonChars = new ArrayList<>();
        for (int i = 0; i < words[0].length(); i++) {
            String character = Character.toString(words[0].charAt(i));
            boolean check = true;
            for (int j = 1; j < words.length; j++) {
                if (!words[j].contains(character)) check = false;
                words[j] = words[j].replaceFirst(character, "");
            }
            if (check) commonChars.add(character);
        }
        return commonChars;
    }

    public List<String> commonCharsAlter(String[] words) {
        int[] minfreq = new int[26];
        for (char c : words[0].toCharArray()) {
            minfreq[c - 'a']++;
        }

        for (int i = 1; i < words.length; i++) {
            int[] freq = new int[26];
            for (char c : words[i].toCharArray()) {
                freq[c - 'a']++;
            }

            for (int j = 0; j < 26; j++) {
                minfreq[j] = Math.min(minfreq[j], freq[j]);
            }
        }

        List<String> commonChars = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < minfreq[i]; j++) {
                commonChars.add(String.valueOf((char)(i + 'a')));
            }
        }

        return commonChars;
    }
}
