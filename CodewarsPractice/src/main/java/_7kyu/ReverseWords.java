package _7kyu;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
https://www.codewars.com/kata/5259b20d6021e9e14c0010d4
 */
public class ReverseWords {
    public static String reverseWords(final String original) {
        if (original.isBlank()) return original;
        StringBuilder reverseWord = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for (String word : original.split(" ")) {
            reverseWord.append(word); // берем слово
            result.append(" ").append(reverseWord.reverse()); // помещаем в другой билдер
            reverseWord.setLength(0); // очищаем temp билдер
        }
        return result.toString().trim();
    }

    public static String reverseWordsAlter(final String original) {
        String[] words = original.split(" ");
        if (words.length == 0) return original;
        int i = 0;
        for (String word : words) {
            // меняем все значения в массиве слов на перевернутые через билдер версии
            words[i] = new StringBuilder(word).reverse().toString();
            i++;
        }
        return String.join(" ", words);
    }

    public static String reverseWordsAlterTwo(final String original) {
        return Arrays.stream(original.split("(?<=\\s)|(?=\\s+)"))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining());
    }
}
