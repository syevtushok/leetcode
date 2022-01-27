package easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2089Test {

    @Test
    void targetIndices() {
        List<Integer> actual = new Solution2089().targetIndices(new int[]{ 1, 2, 5, 2, 3 }, 5);
        assertEquals(List.of(4), actual);
    }

    @Test
    void targetIndices2() {
        List<Integer> actual = new Solution2089().targetIndices(new int[]{ 1, 2, 5, 2, 3 }, 4);
        assertEquals(List.of(), actual);
    }

    @Test
    void targetIndices3() {
        List<Integer> actual = new Solution2089().targetIndices(new int[]{ 100, 1, 100 }, 100);
        assertEquals(List.of(1, 2), actual);
    }

}