package medium;

import easy.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2130Test {

    @Test
    void pairSum() {
        ListNode node = new ListNode(5, new ListNode(4, new ListNode(2, new ListNode(1))));

        int actual = new Solution2130().pairSum(node);

        assertEquals(6, actual);
    }
}