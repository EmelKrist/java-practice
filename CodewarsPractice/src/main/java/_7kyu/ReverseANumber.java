package _7kyu;

/**
 * https://www.codewars.com/kata/555bfd6f9f9f52680f0000c5
 */
public class ReverseANumber {
    public static int reverse(int number) {
        return Integer.parseInt(number >= 0 ?
                new StringBuilder(String.valueOf(number)).reverse().toString() :
                new StringBuilder(String.valueOf(number * -1)).reverse().insert(0, "-").toString());
    }

    public static int reverseAlter(int number) {
        int result = 0;
        while (number != 0) {
            result = result * 10 + number % 10;
            number /= 10;
        }
        return result;
    }

    public static int reverseAlterTwo(int number) {
        // если есть минус, рекурсией сначала получаем перевороченные числа (без -),
        // а потом соединяем с минусом результат
        return number < 0 ?
                -reverseAlterTwo(-number) :
                Integer.parseInt(new StringBuilder("" + number).reverse().toString());
    }

    public static int reverseAlterThree(int number) {
        int sign = Integer.signum(number);
        return sign * Integer.parseInt(
                new StringBuilder(String.valueOf(number).replace("-",""))
                        .reverse()
                        .toString());
    }
}
