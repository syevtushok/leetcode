package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2006Test {

    @Test
    void countKDifference() {
        int actual = new Solution2006().countKDifference(new int[]{ 1, 2, 2, 1 }, 1);

        assertEquals(4, actual);
    }
}