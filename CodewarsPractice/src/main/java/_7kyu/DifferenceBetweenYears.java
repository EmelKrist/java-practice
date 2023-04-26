package _7kyu;

/**
 * https://www.codewars.com/kata/588f5a38ec641b411200005b
 */
public class DifferenceBetweenYears {
    public static int howManyYears(String date1, String date2){
       int difference = Integer.parseInt(date1.split("/")[0]) - Integer.parseInt(date2.split("/")[0]);
       return difference < 0 ? -difference : difference;
    }

    public static int howManyYearsAlter(String date1, String date2){
        return Math.abs(Integer.parseInt(date1.substring(0, 4)) - Integer.parseInt(date2.substring(0, 4)));
    }
}
