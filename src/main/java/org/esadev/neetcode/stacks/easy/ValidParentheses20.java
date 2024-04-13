package org.esadev.neetcode.stacks.easy;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

public class ValidParentheses20 {

  public boolean isValid(String s) {
    Deque<String> deque = new LinkedList<>(); // create a queue
    for (String string : s.split("")) { // iterate through the string
      switch (string) { // switch on the string
        case "(", "[", "{": // if the string is (, [, or {
          deque.add(string); // add the string to the queue
          break; // break
        case ")": { // if the string is )
          if (!Objects.equals(deque.pollLast(), "(")) { // if the last element is not (
            return false; // return false
          }
          break; // break
        }
        case "]": { // if the string is ]
          if (!Objects.equals(deque.pollLast(), "[")) { // if the last element is not [
            return false; // return false
          }
          break; // break
        }
        case "}": { // if the string is }
          if (!Objects.equals(deque.pollLast(), "{")) { // if the last element is not {
            return false; // return false
          }
          break; // break
        }
      }
    }
    return deque.isEmpty(); // return if the queue is empty
  }
}