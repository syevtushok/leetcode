package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1221Test {

    @Test
    void balancedStringSplit() {
        int actual = new Solution1221().balancedStringSplit("RLRRLLRLRL");
        assertEquals(4, actual);
    }
}