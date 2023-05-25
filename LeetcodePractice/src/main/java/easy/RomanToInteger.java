package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/roman-to-integer/
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> romans = new HashMap<>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        int amount = 0;

        for (int i = 0; i < s.length(); i++) {
            int currency = romans.get(s.charAt(i));
            if (i < s.length() - 1 && currency < romans.get(s.charAt(i + 1))) {
                amount -= currency;
            } else {
                amount += currency;
            }
        }

        return amount;
    }
}
