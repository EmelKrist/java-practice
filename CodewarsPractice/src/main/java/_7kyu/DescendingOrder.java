package _7kyu;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/*
https://www.codewars.com/kata/5467e4d82edf8bbf40000155
 */
public class DescendingOrder {
    public static int sortDesc(final int num) {
        String[] strChars = String.valueOf(num).split(""); // массив строковых чисел
        Arrays.sort(strChars, Collections.reverseOrder()); // сортируем по-убыванию
        return Integer.parseInt(String.join("", strChars)); // преобразуем св строку без пробелов и в число
    }

    public static int sortDescAlter(final int num) {
        /* Преобразуем число в строку, разделяем ее на символы, отображаем эти символы,
        как числа (из кода числа в само число), преобразуя в строку. Получается поток чисел,
        содержащихся в строке (массив), сортируем по-убыванию, преобразуем в строку и переводим
        из строки в число */
        return Integer.parseInt(String.valueOf(num)
                .chars()
                .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                .sorted(Collections.reverseOrder())
                .collect(Collectors.joining()));
    }
}
