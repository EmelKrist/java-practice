package _7kyu;

import java.util.HashSet;
import java.util.Set;

/**
 * https://www.codewars.com/kata/5ae7e3f068e6445bc8000046
 */
public class SeeYouNextHappyYear {
    public int nextHappyYear(int year) {
        while (true) {
            if (isHappyYear(++year)) return year;
        }
    }

    public int alterNextHappyYear(int year) {
        while (String.valueOf(++year).chars().distinct().count() != 4) ;
        return year;
    }

    public int secondAlterHappyYear(int year) {
        Set<Character> uniqueDigits = new HashSet<>();
        do {
            char[] digits = Integer.toString(++year).toCharArray();
            for (int i = 0; i < digits.length; i++) {
                uniqueDigits.add(digits[i]);
                if (uniqueDigits.size() < i + 1) {
                    uniqueDigits.clear();
                    break;
                }
            }
        } while (uniqueDigits.size() < 4);
        return year;
    }

    public boolean isHappyYear(int year) {
        int count = 1;
        while (year > 0) {
            int rightDigit = year % 10;
            year = year / 10;
            int temp = year;

            while (temp > 0) {
                if (temp % 10 == rightDigit) {
                    return false;
                } else {
                    temp = temp / 10;
                }
            }
        }
        return true;
    }

}
