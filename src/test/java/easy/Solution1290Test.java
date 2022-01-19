package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1290Test {

    @Test
    void getDecimalValue() {
        int actual = new Solution1290().getDecimalValue(new ListNode(1, new ListNode(0, new ListNode(1))));

        assertEquals(5, actual);
    }
}