package _8kyu;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/5bb904724c47249b10000131
 */
public class TotalAmountOfPoints {
    public static int points(String[] games) {
        int amount = 0;
        for (String g : games) {
            String[] result = g.split(":");
            int x = Integer.parseInt(result[0]);
            int y = Integer.parseInt(result[1]);
            if (x > y) amount += 3;
            else if (x == y) amount++;
        }
        return amount;
    }

    public static int pointsAlter(String[] games) {
        return Arrays.stream(games)
                .mapToInt(i -> i.charAt(0) - i.charAt(2))
                .map(diff -> diff > 0 ? 3 : diff == 0 ? 1 : 0)
                .sum();
    }
}
