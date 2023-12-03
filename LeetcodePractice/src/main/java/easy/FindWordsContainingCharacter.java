package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-words-containing-character/
 */
public class FindWordsContainingCharacter {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int left = 0, right = words.length - 1;
        String character = String.valueOf(x);
        if (left == right && words[0].contains(character)) return List.of(0);

        List<Integer> idxList = new ArrayList<>();
        while (left <= right) {
            if (words[left].contains(character)) idxList.add(left);
            if (left == right) break;
            if (words[right].contains(character)) idxList.add(right);
            left++; right--;
        }

        return idxList;
    }
}
