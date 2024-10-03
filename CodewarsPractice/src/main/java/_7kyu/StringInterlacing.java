package _7kyu;

/**
 * https://www.codewars.com/kata/56e120ee2bb224eaa3000ba2
 */
public class StringInterlacing {
    public static String interlace(final String first, final String second) {
        String firstString = first.replaceAll(" ", "");
        String secondString = second.replaceAll(" ", "");

        if (firstString.length() < secondString.length()) {
           return interlace(secondString, firstString);
        }

        StringBuilder interlace = new StringBuilder();
        for (int i = 0; i < firstString.length(); i++) {
            interlace.append(firstString.charAt(i));
            interlace.append(secondString.charAt(i % secondString.length()));
        }

        return interlace.toString();
    }
}
