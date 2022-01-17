package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2037Test {

    @Test
    void minMovesToSeat() {
        int actual = new Solution2037().minMovesToSeat(new int[]{ 3, 1, 5 }, new int[]{ 2, 7, 4 });

        assertEquals(4, actual);
    }
}