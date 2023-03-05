package _7kyu;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/*
https://www.codewars.com/kata/570f6436b29c708a32000826
 */
public class FirstNotRepeatedCharacter {
    public static Character firstNonRepeated(String source) {
        for (String letter : source.split("")) {
            if (source.length() - source.replaceAll(letter, "").length() == 1) return letter.charAt(0);
        }
        return null;
    }

    public static Character firstNonRepeatedAlter(String source) {
        for (Character letter : source.toCharArray()) {
            // если первый индекс символа также является последним, то возвращаем его
            if (source.indexOf(letter) == source.lastIndexOf(letter)) return letter;
        }
        return null;
    }

    public static Character firstNonRepeatedAlterTwo(String source) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character letter: source.toCharArray()) {
            /* если такое значение есть, берем его и прибавляем к нему единицу,
            в противном случае задаем 0 в качестве значения по-умолчанию,
            прибавляем к нему единицу и задаем его в качестве нынешнего значения
            */
            map.put(letter, map.getOrDefault(letter, 0) + 1);
        }
        for (Character letter: source.toCharArray()){
            if (map.get(letter) == 1) return letter;
        }
        return null;
    }

    public static Character firstNonRepeatedAlterThree(String source) {
        return source.chars() // расщепляем строку на поток символов
                .mapToObj(c -> (char) c) // преобразуем поток в символьные объекты
                // группируем в связный hashMap и подсчитываем количество повторений в качестве значения
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream() // получаем энтри (набор ключ-значений) LinkedHasMap
                .filter(c -> c.getValue() == 1) // фильтруем так, чтобы остались только энтри со значением 1
                .map(c -> c.getKey())// отображаем энтри в виде только ключей
                .findFirst().get(); // находим первый (так как hashMap связный) и получаем значение
    }

}
