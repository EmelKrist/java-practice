package _6kyu;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
https://www.codewars.com/kata/5a8d2bf60025e9163c0000bc/
 */
public class SimpleFrequencySort {
    public static void main(String[] args) {
        for (int i : sortByFrequency(new int[]{2, 3, 5, 3, 7, 9, 5, 3, 7})) System.out.println(i);
    }

    public static int[] sortByFrequency(int[] array) {
        // преобразуем и упаковываем (boxed) массив в список
        List<Integer> arrToList = Arrays.stream(array).boxed().collect(Collectors.toList());
        // группируем в ключи список, вычисляя частоту появления методом counting() в качестве значения Map
        Map<Integer, Long> frequency = arrToList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // сортируем значения списка (ключи map) по значениям map (частота)
        arrToList.sort((x, y) -> {
            if (frequency.get(x) == frequency.get(y)) return x - y;
            return (int) (frequency.get(y) - frequency.get(x));
        });
        // преобразуем в массив и возращаяем
        return arrToList.stream().mapToInt(i -> i).toArray();
    }

    /*
    Некорректная работа
     */
    public static int[] sortByFrequencyAlter(int[] array) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int arrValue : array) {
            if (frequency.containsKey(arrValue)) frequency.put(arrValue, frequency.get(arrValue) + 1);
            else frequency.put(arrValue, 1);
        }

        Map<Integer, Integer> sortedFrequency = frequency.entrySet().stream().
                sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldVal, newVal) -> oldVal, LinkedHashMap::new));

        int index = 0;
        for (Map.Entry<Integer, Integer> map : sortedFrequency.entrySet()) array[index++] = map.getKey();
        return array;
    }
}