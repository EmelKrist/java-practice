package _8kyu;

import java.util.stream.IntStream;

/**
 * https://www.codewars.com/kata/5601409514fc93442500010b
 */
public class HowGoodAreYouReally {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        return IntStream.of(classPoints).average().orElse(0) < yourPoints;
    }

    public static boolean betterThanAverageAlter(int[] classPoints, int yourPoints) {
        int sum = 0;
        for (int point: classPoints) {
            sum+=point;
        }
        return yourPoints > sum / classPoints.length;
    }
}
