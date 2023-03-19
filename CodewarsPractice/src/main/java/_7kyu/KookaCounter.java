package _7kyu;

/*
https://www.codewars.com/kata/58e8cad9fd89ea0c6c000258
 */
public class KookaCounter {
    public static int kookaCounter(final String laughing) {
        if (laughing.isEmpty()) return 0;
        int count = 1;

        StringBuilder str = new StringBuilder(laughing.replace("a", ""));
        String last = str.substring(0, 1), currency;
        str.deleteCharAt(0);

        while (str.length() != 0) {
            currency = str.substring(0, 1);
            if (!last.equals(currency)) {
                last = str.substring(0, 1);
                count++;
            }
            str.deleteCharAt(0);
        }

        return count;
    }


    public static int kookaCounterAlter(final String laughing) {
        return laughing.replaceAll("(Ha)+", "1").replaceAll("(ha)+", "1").length();
    }

    public static int kookaCounterAlterTwo(final String laughing) {
        return laughing.length() != 0 ? laughing.split("Hah|haH").length : 0;
    }

    public static int kookaCounterAlterThree(final String laughing) {
        if (laughing.isEmpty()) return 0;
        int count = 0;
        for (int i = 0; i < laughing.length() - 2; i += 2) {
            if (laughing.charAt(i) != laughing.charAt(i + 2)){
                count++;
            }
        }
        return count;
    }

}
