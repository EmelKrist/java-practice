package _8kyu;

/*
https://www.codewars.com/kata/5a6663e9fd56cb5ab800008b
 */
public class CatYearsAndDogYears {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        if (humanYears == 1) return new int[]{1, 15, 15};
        else if (humanYears == 2) return new int[]{2, 24, 24};
        else {
            int catYears = (humanYears - 2) * 4 + 24;
            int dogYears = catYears + (humanYears - 2);
            return new int[]{humanYears, catYears, dogYears};
        }
    }
}
