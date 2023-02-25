package _7kyu;

/*
https://www.codewars.com/kata/634913db7611b9003dff49ad
 */
public class TheCullingOfStratholme {

    public static void main(String[] args) {
        System.out.println(purify("1i2 33 i4i5 i555ii5"));
    }

    public static String purify(String s) {
        /* удаляем i,I и их соседей (числа или буквы, кроме пробелов), а также удаляем начальные и
        конечные пробелы (trim). Заменяем все 2 и больше пробелов между словами на 1. */
        return s.replaceAll("[\\d\\w]?[iI]+[\\d\\w]?", "").trim().replaceAll(" {2,}", " ");
    }
}
