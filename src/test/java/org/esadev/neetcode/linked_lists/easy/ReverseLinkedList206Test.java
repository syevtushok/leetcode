package org.esadev.neetcode.linked_lists.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import easy.ListNode;
import org.junit.jupiter.api.Test;

class ReverseLinkedList206Test {

  @Test
  void reverseList() {
    var reverseLinkedList = new ReverseLinkedList206();

    ListNode actual = reverseLinkedList.reverseList(
        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))));
    assertEquals(
        new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1))))),
        actual);

    actual = reverseLinkedList.reverseList(new ListNode(1, new ListNode(2)));
    assertEquals(new ListNode(2, new ListNode(1)), actual);

    actual = reverseLinkedList.reverseList(new ListNode());
    assertEquals(new ListNode(), actual);
  }
}