package org.esadev.neetcode.arrays.static_arrays.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RemoveDuplicatesFromSortedArray26Test {

  @Test
  void removeDuplicates() {
    var removeDuplicates = new RemoveDuplicatesFromSortedArray26();
    int actual = removeDuplicates.removeDuplicates(new int[]{1, 1, 2});
    assertEquals(2, actual);
    actual = removeDuplicates.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
    assertEquals(5, actual);
  }
}