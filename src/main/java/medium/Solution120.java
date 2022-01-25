package medium;

import java.util.List;

/*
120. Triangle
https://leetcode.com/problems/triangle/
 */
class Solution120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        for (int i = triangle.size() - 2; i >= 0; i--) {
            List<Integer> rowAbove = triangle.get(i);
            for (int j = 0; j < rowAbove.size(); j++) {
                List<Integer> rowBelow = triangle.get(i + 1);
                int left = rowBelow.get(j);
                int right = rowBelow.get(j + 1);
                int min = Math.min(left, right);
                rowAbove.set(j, rowAbove.get(j) + min);
            }
        }

        return triangle.get(0).get(0);
    }
}