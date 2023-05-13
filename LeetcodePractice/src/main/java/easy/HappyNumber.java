package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/happy-number/
 */
public class HappyNumber {
    public boolean isHappy(int n) {
        // отслеживаем все числа. Если число содержит 1 цифру и повторяется,то выходим из цикла и проверяем на счастливость
        Set<Integer> numbers = new HashSet<>();
        int sumOfSquares = 0;
        while (n != 1 && !numbers.contains(n)) {
            numbers.add(n);
            sumOfSquares = 0;
            while (n > 0) {
                int digit = n % 10;
                sumOfSquares += digit * digit;
                n /= 10;
            }
            n = sumOfSquares;
        }
        return n == 1;
    }
}
