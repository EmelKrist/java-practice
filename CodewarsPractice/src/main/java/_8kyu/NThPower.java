package _8kyu;

/**
 * https://www.codewars.com/kata/57d814e4950d8489720008db
 */
public class NThPower {
    public static int nthPower(int[] array, int n) {
        return n >= 0 && n < array.length ? (int) Math.pow(array[n], n) : -1;
    }

    public static int nthPowerAlter(int[] array, int n) {
        if (n < 0 || n >= array.length) return -1;
        int power = array[n], i = 1;
        while (i != n){
            power*=array[n];
            i++;
        }
        return power;
    }
}
