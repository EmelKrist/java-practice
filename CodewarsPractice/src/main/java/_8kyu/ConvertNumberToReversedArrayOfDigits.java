package _8kyu;

/**
 * https://www.codewars.com/kata/5583090cbe83f4fd8c000051
 */
public class ConvertNumberToReversedArrayOfDigits {
    public static int[] digitize(long n) {
        return new StringBuilder(String.valueOf(n))
                .reverse().toString()
                .chars().map(Character::getNumericValue).toArray();
    }

    public static int[] digitizeAlter(long n) {
        String str = String.valueOf(n);
        int[] array = new int[str.length()];
        for (int i = str.length() - 1; i >= 0; i--) {
            array[str.length() - i - 1] = Character.getNumericValue(str.charAt(i));
        }
        return array;
    }
}
