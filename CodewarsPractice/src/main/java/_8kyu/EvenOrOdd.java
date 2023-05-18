package _8kyu;

/**
 * https://www.codewars.com/kata/53da3dbb4a5168369a0000fe
 */
public class EvenOrOdd {
    public static String even_or_odd(int number) {
        return (number % 2 == 0) ? "Even" : "Odd";
    }

    public static String even_or_odd_Alter(int number) {
        return (number & 1) == 0 ? "Even" : "Odd";
    }
}
