package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution807Test {

    @Test
    void maxIncreaseKeepingSkyline() {
        int actual = new Solution807().maxIncreaseKeepingSkyline(
                new int[][]{ { 3, 0, 8, 4 }, { 2, 4, 5, 7 }, { 9, 2, 6, 3 }, { 0, 3, 1, 0 } });

        assertEquals(35, actual);
    }
}