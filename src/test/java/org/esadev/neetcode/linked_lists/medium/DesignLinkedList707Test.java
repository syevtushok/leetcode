package org.esadev.neetcode.linked_lists.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DesignLinkedList707Test {

  @Test
  void baseTest() {
    DesignLinkedList707 myLinkedList = new DesignLinkedList707();
    myLinkedList.addAtHead(1);
    myLinkedList.addAtTail(3);
    myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
    int actual = myLinkedList.get(1);// return 2
    assertEquals(2, actual);
    myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
    myLinkedList.get(1);              // return 3
    actual = myLinkedList.get(1);// return 3
    assertEquals(3, actual);
  }

  @Test
  void baseTest1() {
    DesignLinkedList707 myLinkedList = new DesignLinkedList707();
    myLinkedList.addAtHead(1);
    myLinkedList.deleteAtIndex(0);
  }

  @Test
  void baseTest2() {
    DesignLinkedList707 myLinkedList = new DesignLinkedList707();
    myLinkedList.addAtHead(7);
    myLinkedList.addAtHead(2);
    myLinkedList.addAtHead(1);
    myLinkedList.addAtIndex(3, 0);
    myLinkedList.deleteAtIndex(2);
    myLinkedList.addAtHead(6);
    myLinkedList.addAtTail(4);
    myLinkedList.get(4);
    myLinkedList.addAtHead(4);
    myLinkedList.addAtIndex(5, 0);
    myLinkedList.addAtHead(6);
  }

  @Test
  void baseTest8() {
    DesignLinkedList707 myLinkedList = new DesignLinkedList707();
    myLinkedList.addAtHead(2);


    myLinkedList.addAtHead(2);
    myLinkedList.addAtHead(1);
    myLinkedList.addAtIndex(3, 0);
    myLinkedList.deleteAtIndex(2);
    myLinkedList.addAtHead(6);
    myLinkedList.addAtTail(4);
    myLinkedList.get(4);
    myLinkedList.addAtHead(4);
    myLinkedList.addAtIndex(5, 0);
    myLinkedList.addAtHead(6);
  }
}