package _7kyu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

/*
https://www.codewars.com/kata/566fc12495810954b1000030
 */
public class CountTheDigit {
    public static int nbDig(int n, int d) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= n; i++) stringBuilder.append(i * i);
        Pattern pattern = Pattern.compile(String.valueOf(d));
        Matcher matcher = pattern.matcher(stringBuilder.toString());
        return (int) matcher.results().count();
    }

    public static int nbDigAlter(int n, int d) {
        int sumOfCounts = 0;
        for (int i = 0; i <= n; i++) {
            sumOfCounts += countOfDigit((i * i), d); // получаем количество d в квадрате числа
        }
        return sumOfCounts;
    }

    private static int countOfDigit(int number, int d) {
        int count = 0;
        do {
            if (number % 10 == d) count++;
            number /= 10;
        } while (number > 0);
        return count;
    }

    public static int nbDigAlterTwo(int n, int d) {
        return (int) IntStream.rangeClosed(0, n) // создаем поток чисел от 0 до n
                .map(i -> i * i) // отображаем поток в виде квадратов этих чисел
                .flatMap(i -> String.valueOf(i).chars()) // преобразуем отображение в поток символов квадратов чисел
                .mapToObj(i -> (char) i) // преобразуем поток в символьный объект
                .mapToInt(Character::getNumericValue) // получаем числа из символов
                .filter(i -> i == d).count(); // считаем количество чисел, совпадающих с d
    }

    public static int nbDigAlterThree(int n, int d) {
        int dChar = String.valueOf(d).charAt(0);
        int count = 0;
        for (int i = 0; i <= n; i++) {
            String square = String.valueOf(i * i);
            count += (int) square.chars().filter(c -> c == dChar).count();
        }
        return count;
    }

}
