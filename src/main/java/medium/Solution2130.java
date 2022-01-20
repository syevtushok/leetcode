package medium;

import easy.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution2130 {
    public int pairSum(ListNode head) {
        List<Integer> list = new ArrayList<>();

        for (ListNode node = head; node != null; node = node.next) {
            list.add(node.val);
        }

        int l = list.size();

        int max = list.get(0) + list.get(l - 1);

        for (int i = 1; i < l / 2; i++) {
            max = Math.max(max, list.get(i) + list.get(l - 1 - i));
        }

        return max;
    }
}