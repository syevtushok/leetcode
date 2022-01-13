package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1614Test {

    @Test
    void maxDepth() {
        int actual = new Solution1614().maxDepth("(1+(2*3)+((8)/4))+1");

        assertEquals(3, actual);
    }
}