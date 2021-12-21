package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1528Test {

    @Test
    void restoreString() {
        String expectedFirst = new Solution1528().restoreString("abc", new int[]{ 0, 1, 2 });
        String expectedSecond = new Solution1528().restoreString("codeleet", new int[]{ 4, 5, 6, 7, 0, 2, 1, 3 });

        assertEquals(expectedFirst, "abc");
        assertEquals(expectedSecond, "leetcode");

    }
}