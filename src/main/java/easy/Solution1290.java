package easy;

/*
1290. Convert Binary Number in a Linked List to Integer
https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 */
class Solution1290 {
    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();

        for (ListNode node = head; node != null; node = node.next) {
            sb.append(node.val);
        }

        return Integer.parseInt(sb.toString(), 2);
    }
}