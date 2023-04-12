package _8kyu;

/**
 * https://www.codewars.com/kata/5aa736a455f906981800360d
 */
public class TheFeastOfManyBeasts {
    public static boolean feast(String beast, String dish) {
        return (beast.charAt(0) == dish.charAt(0)) && (beast.charAt(beast.length()-1) == dish.charAt(dish.length()-1));
    }

    public static boolean feastAlter(String beast, String dish) {
        return beast.substring(0,1).equalsIgnoreCase(dish.substring(0, 1))
                && beast.substring(beast.length()-1).equalsIgnoreCase(
                dish.substring(dish.length()-1));
    }

}


