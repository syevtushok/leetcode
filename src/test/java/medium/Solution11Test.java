package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution11Test {

    @Test
    void maxArea() {
        int actual = new Solution11().maxArea(new int[]{ 1, 8, 6, 2, 5, 4, 8, 3, 7 });

        assertEquals(49, actual);
    }
}