package org.esadev.neetcode.stacks.easy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ValidParentheses20Test {

  @Test
  void isValid() {
    var validParentheses = new ValidParentheses20();

    boolean actual = validParentheses.isValid("()");
    assertTrue(actual);

    actual = validParentheses.isValid("()[]{}");
    assertTrue(actual);

    actual = validParentheses.isValid("(]");
    assertFalse(actual);

    actual = validParentheses.isValid("([)]");
    assertFalse(actual);

    actual = validParentheses.isValid("{[]}");
    assertTrue(actual);
  }
}