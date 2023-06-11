package _6kyu;

import _8kyu.StringRepeat;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/5418a1dd6d8216e18a0012b2
 */
public class ValidateCreditCardNumber {
    public static boolean validate(String n) {
        int[] digits = n.chars().mapToObj(Character::toString).mapToInt(Integer::parseInt).toArray();
        int idxStart = digits.length % 2 == 0 ? 0 : 1;
        for (int i = idxStart; i < digits.length - 1; i+=2) {
            digits[i] = digits[i] * 2;
            if (digits[i] > 9) digits[i]-=9;
        }
        return Arrays.stream(digits).sum() % 10 == 0;
    }
}
