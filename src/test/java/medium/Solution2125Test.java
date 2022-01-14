package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2125Test {

    @Test
    void numberOfBeams() {
        int actual = new Solution2125().numberOfBeams(new String[]{ "011001", "000000", "010100", "001000" });
        assertEquals(8, actual);
    }
}