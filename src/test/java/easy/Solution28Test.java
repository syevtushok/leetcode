package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution28Test {

    @Test
    void strStr() {
        int actual = new Solution28().strStr("hello", "ll");
        assertEquals(2, actual);
    }
}