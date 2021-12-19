package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution1828Test {

    @Test
    void countPointsFirst() {
        int[][] points = { { 1, 3 }, { 3, 3 }, { 5, 3 }, { 2, 2 } };
        int[][] queries = { { 2, 3, 1 }, { 4, 3, 1 }, { 1, 1, 2 } };
        int[] actual = new Solution1828().countPoints(points, queries);
        int[] expected = { 3, 2, 2 };

        assertArrayEquals(expected, actual);
    }

    @Test
    void countPointsSecond() {
        int[][] points = { { 1, 1 }, { 2, 2 }, { 3, 3 }, { 4, 4 }, { 5, 5 } };
        int[][] queries = { { 1, 2, 2 }, { 2, 2, 2 }, { 4, 3, 2 }, { 4, 3, 3 } };
        int[] actual = new Solution1828().countPoints(points, queries);
        int[] expected = { 2, 3, 2, 4 };

        assertArrayEquals(expected, actual);
    }
}