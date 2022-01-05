package easy;

import java.util.List;

/*
1773. Count Items Matching a Rule
https://leetcode.com/problems/count-items-matching-a-rule/
 */
class Solution1773 {

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        int index = ruleKey.equals("type") ? 0 : ruleKey.equals("color") ? 1 : 2;

        for (List<String> list : items) {
            String temp = list.get(index);
            if (temp.equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }
}