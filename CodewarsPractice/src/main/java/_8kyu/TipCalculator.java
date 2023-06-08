package _8kyu;

import java.util.Locale;

/**
 * https://www.codewars.com/kata/56598d8076ee7a0759000087
 */
public class TipCalculator {
    public static Integer calculateTip(double amount, String rating) {
        return switch (rating.toLowerCase()) {
            case "terrible" -> 0;
            case "poor" -> (int) Math.ceil(amount / 100 * 5);
            case "good" -> (int) Math.ceil(amount / 100 * 10);
            case "great" -> (int) Math.ceil(amount / 100 * 15);
            case "excellent" -> (int) Math.ceil(amount / 100 * 20);
            default -> null;
        };
    }
}
