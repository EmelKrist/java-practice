package easy;

/**
 * https://leetcode.com/problems/sort-the-people/
 */
public class SortThePeople {
    public static String[] sortPeople(String[] names, int[] heights) {
        for (int i = 0; i < heights.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < heights.length; j++) {
                if (heights[max] < heights[j]) max = j;
            }
            int tempHeight = heights[i];
            String tempName = names[i];

            heights[i] = heights[max];
            names[i] = names[max];

            heights[max] = tempHeight;
            names[max] = tempName;
        }
        return names;
    }
}
