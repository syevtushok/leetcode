package medium;

import java.math.BigInteger;

import easy.ListNode;

/*
2. Add Two Numbers
https://leetcode.com/problems/add-two-numbers/
 */
public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger firstNum = new BigInteger(extractNumberFromNode(l1, ""));
        BigInteger secondNum = new BigInteger(extractNumberFromNode(l2, ""));

        BigInteger sum = firstNum.add(secondNum);

        return createNodeFromNumber(sum.toString());
    }

    private ListNode createNodeFromNumber(String sum) {
        ListNode root = null;
        char[] c = sum.toCharArray();
        for (int i = c.length - 1; i >= 0; i--) {
            ListNode current = new ListNode(Integer.parseInt("" + c[i]));

            if (root == null) {
                root = current;
            } else {
                ListNode temp = root;

                while (temp.next != null) {
                    temp = temp.next;
                }

                temp.next = current;
            }
        }

        return root;
    }

    private String extractNumberFromNode(ListNode node, String rawNumber) {
        if (node == null) {
            return "";
        }

        return extractNumberFromNode(node.next, rawNumber + node.val) + node.val;
    }
}
