package easy;

/**
 * https://leetcode.com/problems/reformat-date/
 */
public class ReformatDate {
    String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public String reformatDate(String date) {
        String[] partsOfDate = date.split(" ");
        StringBuilder sb = new StringBuilder(partsOfDate[2]+ "-");

        int monthNum = 0;
        for (int i = 0; i < months.length; i++) {
            if (partsOfDate[1].equals(months[i])) {
                monthNum = i + 1;
                break;
            }
        }
        if (monthNum < 10) {
            sb.append("0").append(monthNum);
        } else  {
            sb.append(monthNum);
        }

        sb.append("-");
        if (partsOfDate[0].length() == 4) {
            sb.append(partsOfDate[0], 0, 2);
        } else {
            sb.append("0").append(partsOfDate[0].charAt(0));
        }

        return sb.toString();
    }
}
