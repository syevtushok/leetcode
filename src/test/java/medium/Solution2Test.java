package medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import easy.ListNode;

class Solution2Test {

    private Solution2 solution2UnderTest;

    @BeforeEach
    void setUp() {
        solution2UnderTest = new Solution2();
    }

    @Test
    void testAddTwoNumbers() {
        ListNode l3 = new ListNode(3, null);
        ListNode l2 = new ListNode(4, l3);
        ListNode l1 = new ListNode(2, l2);

        ListNode r3 = new ListNode(4, null);
        ListNode r2 = new ListNode(6, r3);
        ListNode r1 = new ListNode(5, r2);

        ListNode expected = new ListNode(7, new ListNode(0, new ListNode(8)));
        ListNode actual = solution2UnderTest.addTwoNumbers(l1, r1);
        assertEquals(expected.val, actual.val);

    }
}
