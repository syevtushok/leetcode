package org.esadev.neetcode.arrays.static_arrays.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RemoveElements27Test {

  @Test
  void removeElement() {
    var removeElements = new RemoveElements27();

    int actual = removeElements.removeElement(new int[]{3, 2, 2, 3}, 3);
    assertEquals(2, actual);
    actual = removeElements.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2);
    assertEquals(5, actual);
  }
}