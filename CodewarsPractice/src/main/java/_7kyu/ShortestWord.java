package _7kyu;

import java.util.stream.Stream;

/**
 * https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9
 */
public class ShortestWord {
    public static void main(String[] args) {
        System.out.println(findShort("Let's travel abroad shall we"));
    }
    public static int findShort(String s) {
        int length = s.length(), currentLength = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                currentLength++;
            } else {
                if (currentLength < length) length = currentLength;
                currentLength = 0;
            }
        }
        return currentLength < length ? currentLength : length;
    }

    public static int alterFindShort(String s) {
        return Stream.of(s.split(" ")).mapToInt(String::length).min().getAsInt();
    }

    public static int secondAlterFindShort(String s) {
        int length = Integer.MAX_VALUE;
        for (String word : s.split(" ")) {
            int wordLen = word.length();
            if (wordLen < length) length = wordLen;
        }
        return length;
    }



}
