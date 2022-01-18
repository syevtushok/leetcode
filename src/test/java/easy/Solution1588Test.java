package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1588Test {

    @Test
    void sumOddLengthSubarrays() {
        int actual = new Solution1588().sumOddLengthSubarrays(new int[]{ 1, 4, 2, 5, 3 });
        assertEquals(58, actual);
    }
}