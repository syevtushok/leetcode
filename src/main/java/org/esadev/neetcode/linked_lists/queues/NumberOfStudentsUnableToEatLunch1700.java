package org.esadev.neetcode.linked_lists.queues;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Stack;

public class NumberOfStudentsUnableToEatLunch1700 {

  public int countStudents(int[] students, int[] sandwiches) {
    Stack<Integer> sandwichesStack = new Stack<>();
    Queue<Integer> studentsQueue = new LinkedList<>();

    for (int i = 0; i < students.length; i++) {
      sandwichesStack.push(sandwiches[students.length - i - 1]);
      studentsQueue.add(students[i]);
    }

    int lastVisited = 0;

    while (!studentsQueue.isEmpty() && lastVisited < studentsQueue.size()) {
      if (Objects.equals(sandwichesStack.peek(), studentsQueue.peek())) {
        sandwichesStack.pop();
        studentsQueue.poll();
        lastVisited = 0;
      } else {
        studentsQueue.offer(studentsQueue.poll());
        lastVisited++;
      }
    }

    return studentsQueue.size();
  }

}
