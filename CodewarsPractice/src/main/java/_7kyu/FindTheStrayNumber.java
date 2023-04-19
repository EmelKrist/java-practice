package _7kyu;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/57f609022f4d534f05000024
 */
public class FindTheStrayNumber {
    static int stray(int[] numbers) {
        if (numbers[0] != numbers[1]) {
            return numbers[0] == numbers[2] ? numbers[1] : numbers[0];
        }
        int sameNumber = numbers[0];
        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] != sameNumber) return numbers[i];
        }
        return 0;
    }

    static int strayAlter(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0] == numbers[1] ? numbers[numbers.length - 1] : numbers[0];
    }

    static int strayAlterTwo(int[] numbers) {
        return Arrays.stream(numbers).reduce(0, (a, b) -> a ^ b);
    }
}
