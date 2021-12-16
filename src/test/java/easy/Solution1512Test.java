package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1512Test {

    @Test
    void numIdenticalPairs() {
        int actualFirst = new Solution1512().numIdenticalPairs(new int[]{ 1, 2, 3, 1, 1, 3 });
        int actualSecond = new Solution1512().numIdenticalPairs(new int[]{ 1, 1, 1, 1 });
        int actualThird = new Solution1512().numIdenticalPairs(new int[]{ 1, 2, 3 });

        assertEquals(0, actualThird);
        assertEquals(6, actualSecond);
        assertEquals(4, actualFirst);
    }
}