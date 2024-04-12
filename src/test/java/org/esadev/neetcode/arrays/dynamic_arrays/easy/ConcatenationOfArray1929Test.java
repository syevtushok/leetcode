package org.esadev.neetcode.arrays.dynamic_arrays.easy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ConcatenationOfArray1929Test {

  @Test
  void getConcatenation() {
    var concatenation = new ConcatenationOfArray1929();

    int[] actual = concatenation.getConcatenation(new int[]{1, 2, 1});
    assertEquals(6, actual.length);
    assertArrayEquals(new int[]{1, 2, 1, 1, 2, 1}, actual);
  }
}