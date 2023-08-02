package easy;

/**
 * https://leetcode.com/problems/add-strings/description/
 */
public class AddStrings {
    public String addStrings(String num1, String num2) {
        StringBuilder stringSum = new StringBuilder();
        int i = num1.length() - 1, j = num2.length() - 1, reminder = 0;

        while (i >= 0 || j >= 0) {
            int sum = reminder;
            if (i >= 0) sum += num1.charAt(i--) - '0';
            if (j >= 0) sum += num2.charAt(j--) - '0';

            stringSum.append(sum % 10);
            reminder = sum / 10;
        }

        if (reminder != 0) stringSum.append(reminder);
        return stringSum.reverse().toString();
    }
}
