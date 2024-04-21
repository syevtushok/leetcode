package org.esadev.neetcode.linked_lists.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import easy.ListNode;
import org.junit.jupiter.api.Test;

class MergeTwoSortedLists21Test {

  @Test
  void mergeTwoLists() {
    var mergeTwoSortedLists = new MergeTwoSortedLists21();

    ListNode actual = mergeTwoSortedLists.mergeTwoLists(
        new ListNode(1, new ListNode(2, new ListNode(4))),
        new ListNode(1, new ListNode(3, new ListNode(4)))
    );

    assertEquals(
        new ListNode(1,
            new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4)))))),
        actual
    );

    actual = mergeTwoSortedLists.mergeTwoLists(new ListNode(), new ListNode());
    assertEquals(new ListNode(0, new ListNode()), actual);

    actual = mergeTwoSortedLists.mergeTwoLists(new ListNode(), new ListNode(0));
    assertEquals(new ListNode(0, new ListNode()), actual);
  }
}