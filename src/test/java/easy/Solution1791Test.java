package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1791Test {

    @Test
    void findCenter() {
        int actualCenter = new Solution1791().findCenter(new int[][]{ { 1, 2 }, { 2, 3 }, { 4, 2 } });
        assertEquals(2, 2);
    }
}