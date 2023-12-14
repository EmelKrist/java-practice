package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/print-words-vertically/submissions/
 */
public class PrintWordsVertically {
    public List<String> printVertically(String s) {
        List<String> verticallyWords = new ArrayList<>();
        String[] words = s.split(" ");
        int length = getMaxLengthOfWords(words);
        int charIndex = 0;
        while (charIndex < length) {
            StringBuilder verticallyWord = new StringBuilder();
            for (String word : words) {
                if (charIndex < word.length()) {
                    char letter = word.charAt(charIndex);
                    verticallyWord.append(letter);
                } else {
                    verticallyWord.append(" ");
                }
            }
            verticallyWords.add(verticallyWord.toString().stripTrailing());
            charIndex++;
        }
        return verticallyWords;
    }

    private int getMaxLengthOfWords(String[] words) {
        int length = 0;
        for (String word : words) {
            int wordLength = word.length();
            if (wordLength > length) {
                length = wordLength;
            }
        }
        return length;
    }
}
