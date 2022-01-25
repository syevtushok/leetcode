package medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution120Test {

    @Test
    void minimumTotal() {
        int actual1 = new Solution120().minimumTotal(Arrays.asList(Arrays.asList(-1), Arrays.asList(2, 3), Arrays.asList(1, -1, -3)));
        int actual2 = new Solution120().minimumTotal(Arrays.asList(Arrays.asList(2), Arrays.asList(3, 4), Arrays.asList(6, 5, 7), Arrays.asList(4, 1, 8, 3)));
        assertEquals(-1, actual1);
        assertEquals(11, actual2);
    }
}