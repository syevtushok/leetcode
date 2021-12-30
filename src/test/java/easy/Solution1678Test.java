package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1678Test {

    @Test
    void interpret() {
        String actual = new Solution1678().interpret("G()(al)");

        assertEquals("Goal", actual);
    }
}