package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1637Test {

    @Test
    void maxWidthOfVerticalArea() {
        int actual = new Solution1637().maxWidthOfVerticalArea(new int[][]{ { 8, 7 }, { 9, 9 }, { 7, 4 }, { 9, 7 } });

        assertEquals(1, actual);
    }
}