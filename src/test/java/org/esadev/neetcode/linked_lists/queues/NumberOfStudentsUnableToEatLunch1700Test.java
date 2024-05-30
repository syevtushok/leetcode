package org.esadev.neetcode.linked_lists.queues;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NumberOfStudentsUnableToEatLunch1700Test {

  @Test
  void countStudents() {
    var task = new NumberOfStudentsUnableToEatLunch1700();
    int actual = task.countStudents(new int[]{1, 1, 0, 0}, new int[]{0, 1, 0, 1});
    assertEquals(0, actual);
    actual = task.countStudents(new int[]{1, 1, 1, 0, 0, 1}, new int[]{1, 0, 0, 0, 1, 1});
    assertEquals(3, actual);
  }
}