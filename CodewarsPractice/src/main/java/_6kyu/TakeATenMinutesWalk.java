package _6kyu;

/*
https://www.codewars.com/kata/54da539698b8a2ad76000228
*/
public class TakeATenMinutesWalk {
    public static void main(String[] args) {
        System.out.println(isValidWalk(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
    }

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
