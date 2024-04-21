package org.esadev.neetcode.linked_lists.easy;

import easy.ListNode;

public class MergeTwoSortedLists21 {

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode result = new ListNode(); // create a result node
    ListNode current = result; // create a current node
    while (list1 != null && list2 != null) { // while list1 and list2 are not null
      if (list1.val < list2.val) { // if list1 is less than list2
        current.next = list1; // set the next node to list1
        list1 = list1.next; // set list1 to the next node
      } else { // if list2 is less than list1
        current.next = list2; // set the next node to list2
        list2 = list2.next; // set list2 to the next node
      }
      current = current.next; // set the current node to the next node
    }

    if (list1 != null) { // if list1 is not null
      current.next = list1; // set the next node to list1
    }

    if (list2 != null) { // if list2 is not null
      current.next = list2; // set the next node to list2
    }

    return result.next; // return the next node
  }

}
