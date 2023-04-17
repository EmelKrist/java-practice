package _7kyu;

/**
 * https://www.codewars.com/kata/567e8f7b4096f2b4b1000005
 */
public class RegexpBasics {
    public static boolean eightBitNumber(String n) {
        return n.matches("[0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]");
    }
}
