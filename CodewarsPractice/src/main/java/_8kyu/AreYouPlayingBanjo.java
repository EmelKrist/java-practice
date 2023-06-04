package _8kyu;

/**
 * https://www.codewars.com/kata/53af2b8861023f1d88000832
 */
public class AreYouPlayingBanjo {
    public static String areYouPlayingBanjo(String name) {
        return Character.toLowerCase(name.charAt(0)) == 'r' ? name + " plays banjo" : name + " does not play banjo";
    }

    public static String areYouPlayingBanjoAlter(String name) {
        if (name.toUpperCase().startsWith("R")) return name + " plays banjo";
        return name + " does not play banjo";
    }
}
