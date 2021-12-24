package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution1720Test {

    @Test
    void decode() {
        int[] expected = new Solution1720().decode(new int[]{ 1, 2, 3 }, 1);

        assertArrayEquals(new int[]{ 1, 0, 2, 1 }, expected);
    }
}