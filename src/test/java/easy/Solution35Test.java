package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution35Test {

    @Test
    void searchInsert() {
        int actual = new Solution35().searchInsert(new int[]{ 1, 3, 5, 6 }, 5);
        assertEquals(2, actual);
    }
}