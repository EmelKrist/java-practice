package _7kyu;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
https://www.codewars.com/kata/59cfc09a86a6fdf6df0000f1
 */
public class IndexedCapitalization {
    public static String capitalize(String s, int[] ind) {
        StringBuilder stringBuilder = new StringBuilder(s);
        // преобразуем в список
        List<Integer> indexes = Arrays.stream(ind).boxed().collect(Collectors.toList());
        for (int index = 0; index < stringBuilder.length(); index++) {
            if (indexes.contains(index)) // если список содержит индекс, то заменяем символ на UpCase
                stringBuilder.setCharAt(index, Character.toUpperCase(stringBuilder.charAt(index)));
        }
        return stringBuilder.toString();
    }

    public static String capitalizeAlter(String s, int[] ind) {
        char[] charArray = s.toCharArray();
        /* Фильтр только на те индексы, что есть в строке. Итерируем по фильтру и
        заменяем нужные символы в charArray на UpCase */
        Arrays.stream(ind).filter(c -> c < s.length()).
                forEach(c -> charArray[c] = Character.toUpperCase(charArray[c]));
        return new String(charArray);
    }

    public static String capitalizeAlterTwo(String s, int[] ind) {
        char[] charArray = s.toCharArray();
        for (int index : ind) {
            if (index < s.length())
                charArray[index] = Character.toUpperCase(charArray[index]);
        }
        return String.valueOf(charArray);
    }
}
