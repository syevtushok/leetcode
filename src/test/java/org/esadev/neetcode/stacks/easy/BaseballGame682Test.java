package org.esadev.neetcode.stacks.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BaseballGame682Test {

  @Test
  void calPoints() {
    var baseballGame = new BaseballGame682();

    int actual = baseballGame.calPoints(new String[]{"5", "2", "C", "D", "+"});
    assertEquals(30, actual);

    actual = baseballGame.calPoints(new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"});
    assertEquals(27, actual);

    actual = baseballGame.calPoints(new String[]{"1", "C"});
    assertEquals(0, actual);
  }
}