package org.esadev.neetcode.linked_lists.easy;

import easy.ListNode;

public class ReverseLinkedList206 {

  public ListNode reverseList(ListNode head) {
    ListNode prev = null; // create a prev node
    ListNode curr = head; // create a curr node

    while (curr != null) { // while the curr node is not null
      ListNode next = curr.next; // get the next node
      curr.next = prev; // set the next node to the prev node
      prev = curr; // set the prev node to the curr node
      curr = next; // set the curr node to the next node
    }

    return prev; // return the prev node
  }

}
