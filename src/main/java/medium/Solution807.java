package medium;

/*
807. Max Increase to Keep City Skyline
https://leetcode.com/problems/max-increase-to-keep-city-skyline/
 */
class Solution807 {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int l = grid.length;
        int[] maxRow = new int[l];
        int[] maxColumn = new int[l];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                maxRow[i] = Math.max(maxRow[i], grid[i][j]);
                maxColumn[j] = Math.max(maxColumn[j], grid[i][j]);
            }
        }

        int count = 0;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                count += Math.min(maxRow[i], maxColumn[j]) - grid[i][j];
            }
        }

        return count;
    }
}