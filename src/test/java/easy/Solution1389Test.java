package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution1389Test {

    @Test
    void createTargetArray() {
        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };

        int[] expected = { 0, 4, 1, 3, 2 };
        int[] actual = new Solution1389().createTargetArray(nums, index);

        assertArrayEquals(expected, actual);
    }
}