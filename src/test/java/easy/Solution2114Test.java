package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2114Test {

    @Test
    void mostWordsFound() {
        int actual = new Solution2114()
                .mostWordsFound(new String[]{ "alice and bob love leetcode", "i think so too", "this is great thanks very much" });
        assertEquals(6, actual);
    }
}