package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution1365Test {

    @Test
    void smallerNumbersThanCurrent() {
        int[] expected = new Solution1365().smallerNumbersThanCurrent(new int[]{ 8, 1, 2, 2, 3 });
        int[] actual = { 4, 0, 1, 1, 3 };
        assertArrayEquals(expected, actual);
    }
}