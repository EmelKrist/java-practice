package _8kyu;

/**
 * https://www.codewars.com/kata/5a3fe3dde1ce0e8ed6000097
 */
public class CenturyFromYear {
    public static int century(int number) {
        return number % 100 != 0 ? number / 100 + 1 : number / 100;
    }

    public static int centuryAlter(int number) {
        return (number + 99) / 100;
    }
}
