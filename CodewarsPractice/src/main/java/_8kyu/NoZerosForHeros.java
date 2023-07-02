package _8kyu;

/**
 * https://www.codewars.com/kata/570a6a46455d08ff8d001002
 */
public class NoZerosForHeros {
    public static int noBoringZeros(int n) {
        while(n != 0) {
            if (n % 10 == 0) n/=10; else return n;
        }
        return 0;
    }
}
