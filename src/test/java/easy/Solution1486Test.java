package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
1486. XOR Operation in an Array
https://leetcode.com/problems/xor-operation-in-an-array/
 */
class Solution1486Test {

    @Test
    void xorOperation() {
        int actual = new Solution1486().xorOperation(5, 0);
        assertEquals(8, actual);
    }

    @Test
    void xorOperationStream() {
        int actual = new Solution1486().xorOperationStream(4, 3);
        assertEquals(8, actual);
    }
}