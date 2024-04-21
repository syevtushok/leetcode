package org.esadev.neetcode.linked_lists.medium;

import easy.ListNode;

public class DesignLinkedList707 {

  private ListNode head;
  private ListNode tail;
  private int size;

  public DesignLinkedList707() {

  }

  public int get(int index) {
    if (index < 0 || index >= size) {
      return -1;
    }
    ListNode node = findByIndex(index);
    return node != null ? node.val : -1;
  }

  public void addAtHead(int val) {
    ListNode newNode = new ListNode(val);
    if (head == null) {
      head = newNode;
      tail = newNode;
    } else {
      newNode.next = head;
      head = newNode;
    }
    size++;
  }

  public void addAtTail(int val) {
    ListNode newNode = new ListNode(val);
    if (tail == null) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      tail = newNode;
    }
    size++;
  }

  public void addAtIndex(int index, int val) {
    if (index < 0 || index > size) {
      return;
    }

    if (index == 0) {
      addAtHead(val);
    } else if (index == size) {
      addAtTail(val);
    } else {
      ListNode byIndex = findByIndex(index - 1);
      ListNode listNode = new ListNode(val);
      listNode.next = byIndex.next;
      byIndex.next = listNode;
      size++;
    }

  }

  public void deleteAtIndex(int index) {
    if (index < 0 || index >= size) {
      return;
    }
    if (index == 0) {
      head = head.next;
      if (size == 1) {
        tail = null;
      }
    } else {
      ListNode prev = findByIndex(index - 1);
      if (prev.next == tail) {
        tail = prev;
        tail.next = null;
      } else {
        prev.next = prev.next.next;
      }
    }
    size--;

  }

  private ListNode findByIndex(int index) {
    int i = 0;
    for (ListNode temp = head; temp != null; temp = temp.next) {
      if (i++ == index) {
        return temp;
      }
    }
    throw new IllegalArgumentException();
  }
}