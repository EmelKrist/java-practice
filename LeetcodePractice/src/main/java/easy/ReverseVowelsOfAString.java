package easy;

/**
 * https://leetcode.com/problems/reverse-vowels-of-a-string/
 */
public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            while (i < j && !vowels.contains(Character.toString(s.charAt(i)))) i++;
            while (i < j && !vowels.contains(Character.toString(s.charAt(j)))) j--;
            sb.setCharAt(i , s.charAt(j));
            sb.setCharAt(j , s.charAt(i));
            i++; j--;
        }
        return sb.toString();
    }
}
