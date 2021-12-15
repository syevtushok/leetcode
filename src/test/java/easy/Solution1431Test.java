package easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1431Test {

    @Test
    void kidsWithCandies() {
        int[] candies = new int[]{ 2, 3, 5, 1, 3 };
        int extraCandies = 3;

        List<Boolean> expected = List.of(true, true, true, false, true);
        List<Boolean> actual = new Solution1431().kidsWithCandies(candies, extraCandies);
        assertEquals(expected, actual);
    }

    @Test
    void kidsWithCandies2() {
        int[] candies = new int[]{ 4, 2, 1, 1, 2 };
        int extraCandies = 1;

        List<Boolean> expected = List.of(true, false, false, false, false);
        List<Boolean> actual = new Solution1431().kidsWithCandies(candies, extraCandies);
        assertEquals(expected, actual);
    }
}