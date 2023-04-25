package _7kyu;

/**
 * https://www.codewars.com/kata/59e1b9ce7997cbecb9000014
 */
public class Cogs {
    public static double cogRpm(final int[] cogs) {
        return (cogs.length % 2 == 0 ? -1d : 1d) * cogs[0] / cogs[cogs.length - 1];
    }
}
