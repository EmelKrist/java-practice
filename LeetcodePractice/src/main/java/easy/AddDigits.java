package easy;


/**
 * https://leetcode.com/problems/add-digits/
 */
public class AddDigits {
    public int addDigits(int num) {
        int digits = num;
        while (digits > 9) {
            int sum = 0;
            while (digits != 0) {
                sum += digits % 10;
                digits /= 10;
            }
            digits = sum;
        }

        return digits;
    }
}
