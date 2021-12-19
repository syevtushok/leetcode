package medium;

/**
 * 1828. Queries on Number of Points Inside a Circle
 * https://leetcode.com/problems/queries-on-number-of-points-inside-a-circle/
 * <p>
 * Distance Formula
 * √(x2−x1)^2 + (y2-y1)^2
 */
public class Solution1828 {

    public int[] countPoints(int[][] points, int[][] queries) {
        int[] ints = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int count = 0;
            for (int[] point : points) {
                double first = Math.pow((query[0] - point[0]), 2);
                double second = Math.pow((query[1] - point[1]), 2);
                double z = Math.sqrt((first + second));
                if (z <= query[2]) {
                    count++;
                }
            }
            ints[i] = count;
        }

        return ints;
    }

}