package easy;

import java.util.List;

/**
 * https://leetcode.com/problems/count-items-matching-a-rule/
 */
public class CountItemsMatchingARule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int countMatches = 0;
        for (List<String> item : items) {
            String type = item.get(0);
            String color = item.get(1);
            String name = item.get(2);
            if ("type".equals(ruleKey) && type.equals(ruleValue)) countMatches++;
            else if ("color".equals(ruleKey) && color.equals(ruleValue)) countMatches++;
            else if ("name".equals(ruleKey) && name.equals(ruleValue)) countMatches++;
        }
        return countMatches;
    }

    public int countMatchesAlter(List<List<String>> items, String ruleKey, String ruleValue) {
        int countMatches = 0;
        int ruleType = 0;
        switch (ruleKey) {
            case "type" -> ruleType = 0;
            case "color" -> ruleType = 1;
            case "name" -> ruleType = 2;
        }

        for (List<String> item : items) {
            if (item.get(ruleType).equals(ruleValue)) countMatches++;
        }
        return countMatches;
    }
}
