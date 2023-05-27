package _8kyu;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.codewars.com/kata/57e76bc428d6fbc2d500036d
 */
public class StringToArray {
    public static String[] stringToArray(String s) {
        return s.split(" ");
    }

    public static String[] stringToArrayAlter(String s) {
        List<String> split = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != ' ') word.append(s.charAt(i));
            else {
                split.add(word.toString());
                word.setLength(0);
            }
        }
        split.add(word.toString());
        return split.toArray(new String[0]);
    }
}
