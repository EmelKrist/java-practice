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

    public boolean isHappyAlter(int n) {
        int slow, fast;
        slow = fast = n;

        do {
            slow = findSumOfSquares(slow);
            fast = findSumOfSquares(findSumOfSquares(fast));
        } while (slow != fast);

        if (slow == 1) {
            return true;
        }
        return false;
    }

    private int findSumOfSquares(int num) {
        int sumOfSquares = 0;
        while (num > 0) {
            int digit = num % 10;
            sumOfSquares += digit * digit;
            num /= 10;
        }
        return sumOfSquares;
    }
}
