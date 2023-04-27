package _7kyu;


/**
 * https://www.codewars.com/kata/5502ddd734137e90af000f62
 */
public class ConvertTimeToString {
    public static String convertTime(int timeDiff) {
        return timeDiff / 86400 + " " +
                (timeDiff % 86400) / 3600 + " " +
                (timeDiff % 86400 % 3600) / 60 + " " +
                (timeDiff % 86400 % 3600 % 60);
    }

    public static String convertTimeAlter(int timeDiff) {
        return String.format("%s %s %s %s", timeDiff / 86400, timeDiff % 86400 / 3600, timeDiff % 3600 / 60, timeDiff % 60);
    }
}
