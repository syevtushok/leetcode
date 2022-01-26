package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution941Test {

    @Test
    void validMountainArray() {
        boolean actual = new Solution941().validMountainArray(new int[]{ 0, 3, 2, 1 });
        assertTrue(actual);
    }
}