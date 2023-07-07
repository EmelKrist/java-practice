package _8kyu;

/**
 * https://www.codewars.com/kata/555086d53eac039a2a000083
 */
public class OppositesAttract {
    public static boolean isLove(final int flower1, final int flower2) {
        return flower1 % 2 == 0 && flower2 % 2 == 1 || flower1 % 2 == 1 && flower2 % 2 == 0;
    }

    public static boolean isLoveAlter(final int flower1, final int flower2) {
        return flower1 % 2 != flower2 % 2;
    }
}
