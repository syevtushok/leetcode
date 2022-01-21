package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1688Test {

    @Test
    void numberOfMatchesEven() {
        int actual = new Solution1688().numberOfMatches(14);
        assertEquals(13, actual);
    }

    @Test
    void numberOfMatchesOdd() {
        int actual = new Solution1688().numberOfMatches(7);
        assertEquals(6, actual);
    }

}