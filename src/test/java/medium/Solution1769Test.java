package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution1769Test {

    @Test
    void minOperations() {
        int[] actualFirst = new Solution1769().minOperations("110");
        int[] actualSecond = new Solution1769().minOperations("001011");

        assertArrayEquals(new int[]{ 1, 1, 3 }, actualFirst);
        assertArrayEquals(new int[]{ 11, 8, 5, 4, 3, 4 }, actualSecond);
    }
}