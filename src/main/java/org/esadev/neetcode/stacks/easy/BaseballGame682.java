package org.esadev.neetcode.stacks.easy;

import java.util.Deque;
import java.util.LinkedList;

public class BaseballGame682 {

  /*
  Explanation:
  "5" - Add 5 to the record, record is now [5].
  "2" - Add 2 to the record, record is now [5, 2].
  "C" - Invalidate and remove the previous score, record is now [5].
  "D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
  "+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
  The total sum is 5 + 10 + 15 = 30.

   */

  public int calPoints(String[] operations) {
    Deque<Integer> queue = new LinkedList<>(); // create a queue
    int sum = 0; // create a sum variable

    for (String operation : operations) { // iterate through the operations
      switch (operation) { // switch on the operation
        case "C": // if the operation is C
          sum -= queue.pollLast(); // subtract the last element from the sum
          break; // break
        case "D": { // if the operation is D
          int tempResult = queue.peekLast() * 2; // get the last element and multiply it by 2
          queue.add(tempResult); // add the result to the queue
          sum += tempResult; // add the result to the sum
          break; // break
        }
        case "+": { // if the operation is +
          int previous = queue.pollLast(); // get the last element
          int previousBefore = queue.peekLast(); // get the element before the last element
          int tempResult = previous + previousBefore; // add the two elements
          queue.add(previous); // add the last element back to the queue
          queue.add(tempResult); // add the result to the queue
          sum += tempResult; // add the result to the sum
          break; // break
        }
        default: // if the operation is a number
          int value = Integer.parseInt(operation); // parse the operation to an integer
          queue.add(value); // add the value to the queue
          sum += value; // add the value to the sum
          break; // break;
      }
    }

    return sum; // return sum;
  }
}
