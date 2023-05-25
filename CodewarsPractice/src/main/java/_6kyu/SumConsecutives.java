package _6kyu;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.codewars.com/kata/55eeddff3f64c954c2000059
 */
public class SumConsecutives {
    public static List<Integer> sumConsecutives(List<Integer> s) {
        List<Integer> sums = new ArrayList<>();
        int current = s.get(0);
        for (int i = 0; i < s.size() - 1; i++) {
            int next = s.get(i + 1);
            if (s.get(i) == next) {
                current += next;
            } else {
                sums.add(current);
                current = next;
                if (i == s.size() - 2) sums.add(current);
            }
        }

        return sums;
    }
}
