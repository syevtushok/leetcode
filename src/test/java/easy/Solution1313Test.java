package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution1313Test {

    @Test
    void decompressRLElist() {
        int[] param = { 1, 2, 3, 4 };
        int[] actual = new Solution1313().decompressRLElist(param);
        int[] expected = { 2, 4, 4, 4 };

        assertArrayEquals(expected, actual);
    }
}