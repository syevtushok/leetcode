package medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution122Test {

    @Test
    void maxProfit() {
        int actual1 = new Solution122().maxProfit(new int[]{ 7, 1, 5, 3, 6, 4 });
        int actual2 = new Solution122().maxProfit(new int[]{ 1, 2, 3, 4, 5 });
        int actual3 = new Solution122().maxProfit(new int[]{ 7, 6, 4, 3, 1 });

        assertEquals(7, actual1);
        assertEquals(4, actual2);
        assertEquals(0, actual3);
    }
}