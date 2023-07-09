package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/keyboard-row/
 */
public class KeyboardRow {

    String firstRow = "qwertyuiop";
    String secondRow = "asdfghjkl";
    String thirstRow = "zxcvbnm";

    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        for (String word : words) {
            String lowerFirstLetter = Character.toString(word.charAt(0)).toLowerCase();
            String checkedRow = "";
            if (firstRow.contains(lowerFirstLetter)) {
                checkedRow = firstRow;
            } else if (secondRow.contains(lowerFirstLetter)) {
                checkedRow = secondRow;
            } else if (thirstRow.contains(lowerFirstLetter)) {
                checkedRow = thirstRow;
            }
            boolean checked = true;
            for (int i = 1; i < word.length(); i++) {
                String letter = Character.toString(word.charAt(i)).toLowerCase();
                if (!checkedRow.contains(letter)) {
                    checked = false;
                    break;
                }
            }
            if (checked) {
                list.add(word);
            }
        }
        return list.toArray(new String[0]);
    }
}
