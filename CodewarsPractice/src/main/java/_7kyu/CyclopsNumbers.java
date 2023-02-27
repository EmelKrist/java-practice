package _7kyu;

/*
https://www.codewars.com/kata/56b0bc0826814364a800005a
 */
public class CyclopsNumbers {

    /*
    Усложнила решение, так как подумала, что глазом циклопа может быть, как
    1, так и 0. Однако глаз всегда - 0
     */
    public static boolean cyclops(long n) {
        String binaryStr = Long.toBinaryString(n); // преобразуем в двоичное число
        int nLength = binaryStr.length(); // получаем длину 2 представления
        if (nLength % 2 == 0 || nLength < 3) return false; // если длина четная и меньше 3, то точно не циклоп
        long count = binaryStr.chars().filter(c -> c == '1').count(); // получаем кол-во единиц
        /* если глаз циклопа - 1 (1 одна) и по-середине числа находится 1, то циклоп ИЛИ
        если глаз циклопа - 0 (1 на одну меньше длины числа) и по-середине числа находится 0, то циклоп */
        return (count == 1 && binaryStr.charAt(nLength / 2) == '1')
        || (count == binaryStr.length() - 1 && binaryStr.charAt(nLength / 2) == '0');
    }

    public static boolean cyclopsAlter(long n) {
        return Long.toBinaryString(n).matches("\\b(1+)0\\1\\b");
    }

    public static boolean cyclopsAlterTwo(long n) {
        String binaryStr = Long.toBinaryString(n);
        return binaryStr.length() % 2 != 0
                && binaryStr.chars().filter(c -> c == '0').count() == 1
                && binaryStr.charAt(binaryStr.length() / 2) == '0';
    }

}
