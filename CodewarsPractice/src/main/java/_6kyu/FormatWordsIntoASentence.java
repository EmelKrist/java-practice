package _6kyu;

import java.util.*;
import java.util.stream.Collectors;

/*
https://www.codewars.com/kata/51689e27fe9a00b126000004
 */
public class FormatWordsIntoASentence {
    public static void main(String[] args) {
        System.out.println(formatWords(new String[]{"one", "two", "three", "four"}));
        System.out.println(formatWordsAlter(new String[]{"one", "two", "three", "four"}));
        System.out.println(formatWordsAlterTwo(new String[]{"one", "two", "three", "four"}));
    }

    public static String formatWords(String[] words) {
        if (words == null) return "";
        LinkedList<String> noEmptyWords = new LinkedList<>();
        for (String word : words)
            if (!word.isEmpty()) noEmptyWords.add(word); // добавляем только непустые

        StringBuilder sentence = new StringBuilder();
        /* если слово первое, то добавляем просто слово, иначе...
           если слово последнее, то and + слово, иначе , + слово */
        for (int i = 0; i < noEmptyWords.size(); i++)
            sentence.append((i != 0 ? (i == noEmptyWords.size() - 1 ? " and " : ", ") : "") + noEmptyWords.get(i));

        return sentence.toString();
    }

    public static String formatWordsAlter(String[] words) {
        if (words == null || words.length == 0) return "";
        List<String> noEmptyWords = new ArrayList<>(Arrays.asList(words));
        noEmptyWords.removeIf(String::isEmpty); // удаляем все путые строки

        if (noEmptyWords.isEmpty()) {
            return "";
        } else if (noEmptyWords.size() == 1) return noEmptyWords.get(0);

        StringBuilder sentence = new StringBuilder();
        // заходим в строку и ставим между подстроками (словами) запятые до последнего (не включительно)
        sentence.append(String.join(", ", noEmptyWords.subList(0, noEmptyWords.size() - 1)));
        // добавляем and + последнее слово и возвращаем
        return sentence.append(" and ").append(noEmptyWords.get(noEmptyWords.size() - 1)).toString();
    }

    public static String formatWordsAlterTwo(String[] words) {
        if (words == null || words.length == 0) return "";
        // фильтруем массив по не пустым словам, ставим после слов запятые, преобразуем в строку
        String sentence = Arrays.stream(words).filter(w -> !w.isEmpty()).collect(Collectors.joining(", "));
        // последнее слово регуляркой заменяем на and + слово
        return sentence.replaceAll(", ([^,]+)$", " and $1");
    }
}
