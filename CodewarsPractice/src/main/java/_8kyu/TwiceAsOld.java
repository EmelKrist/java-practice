package _8kyu;

/**
 * https://www.codewars.com/kata/5b853229cfde412a470000d0/train/java
 */
public class TwiceAsOld {
    public static int TwiceAsOld(int dadYears, int sonYears){
        return Math.abs(dadYears - (sonYears * 2));
    }

    public static int TwiceAsOldAlter(int dadYears, int sonYears){
        int diff = dadYears - sonYears - sonYears;
        return diff > 0 ? diff : -diff;
    }
}
