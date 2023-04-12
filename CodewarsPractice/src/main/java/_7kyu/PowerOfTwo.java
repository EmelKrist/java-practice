package _7kyu;

/**
 * https://www.codewars.com/kata/534d0a229345375d520006a0
 */
public class PowerOfTwo {
    public static boolean isPowerOfTwo(long n) {
        return n != 0 && (n & (n - 1)) == 0;
    }

    public static boolean isPowerOfTwoAlter(long n) {
        // если число - степень двойки, то оно четное
        // и ее деление на 2 (множественное) всегда закончится 1 (2 / 2 = 1)
        while (n % 2 == 0 && n > 1) n /= 2;
        return n == 1;
    }

    public static boolean isPowerOfTwoAlterTwo(long n) {
        return Long.toBinaryString(n).matches("10*");
    }

    public static boolean isPowerOfTwoAlterThree(long n) {
        if (n == 0) return false;
        else if (n == 1) return true;
        else if (n % 2 == 1) return false;
        else return isPowerOfTwoAlterThree(n / 2);
    }
}
