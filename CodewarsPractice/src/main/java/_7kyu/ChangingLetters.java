package _7kyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
https://www.codewars.com/kata/5831c204a31721e2ae000294
 */
public class ChangingLetters {
    public static String swap(String st) {
        return st.replace("a", "A")
                .replace("o", "O")
                .replace("u", "U")
                .replace("i", "I")
                .replace("e", "E");
    }

    public static String swapAlter(String st) {
        StringBuilder stringBuilder = new StringBuilder(st);
        List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'o', 'u', 'i', 'e'));
        char letter;
        for (int i = 0; i < st.length(); i++) {
            letter = stringBuilder.charAt(i);
            if (vowels.contains(letter) && Character.isLowerCase(letter))
                stringBuilder.setCharAt(i, Character.toUpperCase(letter));
        }
        return stringBuilder.toString();
    }

    public static String swapAlterTwo(String st) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Character c : st.toCharArray()) {
            if (c != 'a' && c != 'o' && c != 'u' && c != 'i' && c != 'e'){
                stringBuilder.append(c);
            } else {
                stringBuilder.append(Character.toUpperCase(c));
            }
        }
        return stringBuilder.toString();
    }
}
