package medium;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/fruit-into-baskets/
 */
public class FruitIntoBaskets {
    public int totalFruit(int[] fruits) {
        int max = -1, start = 0, end = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (end < fruits.length) {
            int fruit = fruits[end];
            map.put(fruit, map.getOrDefault(fruit, 0) + 1);

            if (map.size() < 2) {
                end++;
            }

            if (map.size() == 2) {
                if (end - start + 1 > max) {
                    max = end - start + 1;
                }
                end++;
            }

            if (map.size() > 2) {
                while (map.size() > 2) {
                    map.put(fruits[start], map.get(fruits[start]) - 1);
                    if (map.get(fruits[start]) < 1) map.remove(fruits[start]);
                    start++;
                }
                end++;
            }
        }

        if (map.size() == 1) return fruits.length;
        return max;
    }
}
