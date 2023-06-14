package _6kyu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://www.codewars.com/kata/54da5a58ea159efa38000836
 */
public class FindTheOddInt {
    public static int findIt(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : a) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        return map.entrySet().stream()
                .filter(i -> i.getValue() % 2 == 1)
                .mapToInt(Map.Entry::getKey).sum();
    }

    public static int findItAlter(int[] a) {
        int xor = 0;
        for (int i : a) {
            xor ^= i;
        }
        return xor;
    }

    public static int findItAlterTwo(int[] a) {
        return Arrays.stream(a).reduce(0, (x, y) -> x ^ y);
    }
}
