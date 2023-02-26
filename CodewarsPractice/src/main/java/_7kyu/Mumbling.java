package _7kyu;

/*
https://www.codewars.com/kata/5667e8f4e3f572a8f2000039/
 */
public class Mumbling {
    public static void main(String[] args) {
        System.out.println(accum("abcd"));
        System.out.println(accumAlter("abcd"));
    }

    public static String accum(String s) {
        StringBuilder output = new StringBuilder();
        s = s.toUpperCase();
        for (int i = 0; i < s.length(); i++) {
            output.append(s.charAt(i));
            for (int j = 0; j < i; j++) {
                output.append(String.valueOf(s.charAt(i)).toLowerCase());
            }
            output.append("-");
        }
        return output.toString().substring(0, output.length() - 1);
    }

    public static String accumAlter(String s) {
        StringBuilder output = new StringBuilder();
        int count = 0;
        for (char i : s.toCharArray()) {
            if (count != 0) output.append("-");
            output.append(Character.toUpperCase(i));
            for (int j = 0; j < count; j++) {
                output.append(i);
            }
            count++;
        }
        return output.toString();
    }
}
