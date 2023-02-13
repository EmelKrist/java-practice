public class Six_kyu {
    public static void main(String[] args) {
        //System.out.println(camelCase("camelCasing"));
        //System.out.println(bouncingBall(3.0, 0.66, 1.5));
        //System.out.println(isValidWalk(new char[] {'n','s','n','s','n','s','n','s','n','s'});
    }

    /*
    Complete the solution so that the function will
    break up camel casing, using a space between words
     */
    private static String camelCase(String input) {
        StringBuilder output = new StringBuilder();
        char symbol;
        for (int i = 0; i < input.length(); i++) {
            symbol = input.charAt(i);
            output.append(Character.isUpperCase(symbol) ? " " + symbol : symbol);
        }
        return output.toString();
    }

    private static String camelCaseAlter(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }

    /*
    A child is playing with a ball on the nth floor of a tall building.
    The height of this floor above ground level, h, is known.
    He drops the ball out of the window. The ball bounces (for example),
    to two-thirds of its height (a bounce of 0.66).
    His mother looks out of a window 1.5 meters from the ground.
    How many times will the mother see the ball pass in front of her
    window (including when it's falling and bouncing?
    Three conditions must be met for a valid experiment:
    *Float parameter "h" in meters must be greater than 0
    *Float parameter "bounce" must be greater than 0 and less than 1
    *Float parameter "window" must be less than h.
    If all three conditions above are fulfilled, return a positive integer,
    otherwise return -1.
     */
    private static int bouncingBall(double h, double bounce, double window) {
        if ((h > 0) && (bounce > 0) && (bounce < 1) && (window < h)) {
            int count = 1;
            h*=bounce;
            while (h > window) {
                h *= bounce;
                count+=2;
            }
            return count;
        } else return -1;
    }

    private static int bouncingBallAlter(double h, double bounce, double window){
       return ((h > 0) && (bounce > 0) && (bounce < 1) && (window < h)) ? 2 + bouncingBallAlter(h * bounce, bounce, window): -1;
    }

    /*
    https://www.codewars.com/kata/54da539698b8a2ad76000228
     */
    public static boolean isValidWalk(char[] walk) {
        if (walk.length == 10) {
            int xStep = 0, yStep = 0;
            for (int i = 0; i < walk.length; i++) {
                switch (walk[i]) {
                    case 'n':
                        yStep++;
                        break;
                    case 's':
                        yStep--;
                        break;
                    case 'e':
                        xStep++;
                        break;
                    default:
                        xStep--;
                }
            }
            return xStep == 0 && yStep == 0;
        }
        return false;
    }
}
