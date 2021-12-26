package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1342Test {

    @Test
    void numberOfSteps() {
        int actual = new Solution1342().numberOfSteps(14);

        assertEquals(14, actual);
    }
}