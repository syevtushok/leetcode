package medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1282Test {

    @Test
    void groupThePeople() {
        List<List<Integer>> actual = new Solution1282().groupThePeople(new int[]{ 3, 3, 3, 3, 3, 1, 3 });
        List<List<Integer>> expected = List.of(List.of(0, 1, 2), List.of(5), List.of(3, 4, 6));

        assertEquals(expected, actual);
    }
}