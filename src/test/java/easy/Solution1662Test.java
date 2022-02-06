package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution1662Test {

    @Test
    void arrayStringsAreEqual() {
        boolean actual = new Solution1662().arrayStringsAreEqual(new String[]{ "ab", "c" }, new String[]{ "a", "bc" });
        assertTrue(actual);
    }
}