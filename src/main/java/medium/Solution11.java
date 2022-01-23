package medium;

/*
11. Container With Most Water
https://leetcode.com/problems/container-with-most-water/
 */
class Solution11 {
    public int maxArea(int[] height) {
        int maxWater = 0;

        for (int leftLine = 0, rightLine = height.length - 1; leftLine < rightLine; ) {
            int leftLineHeight = height[leftLine];
            int rightLineHeight = height[rightLine];

            int minLineHeight = Math.min(leftLineHeight, rightLineHeight);

            maxWater = Math.max(maxWater, minLineHeight * (rightLine - leftLine));

            if (leftLineHeight < rightLineHeight) {
                leftLine++;
            } else {
                rightLine--;
            }
        }

        return maxWater;
    }
}