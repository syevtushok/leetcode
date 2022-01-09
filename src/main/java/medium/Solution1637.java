package medium;

import java.util.Arrays;

/*
1637. Widest Vertical Area Between Two Points Containing No Points
https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/
 */
public class Solution1637 {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] x = new int[points.length];

        for (int i = 0; i < points.length; i++) {
            x[i] = points[i][0];
        }

        Arrays.sort(x);

        int max = 0;

        for (int i = 0; i < x.length - 1; i++) {
            max = Math.max(max, x[i + 1] - x[i]);
        }

        return max;
    }
}