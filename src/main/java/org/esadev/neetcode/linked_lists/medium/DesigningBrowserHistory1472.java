package org.esadev.neetcode.linked_lists.medium;

import java.util.LinkedList;
import java.util.List;

public class DesigningBrowserHistory1472 {

  private final List<String> queue;
  private int position;

  public DesigningBrowserHistory1472(String homepage) {
    queue = new LinkedList<>();
    queue.add(homepage);
    position = 0;
  }

  public void visit(String url) {
    while (queue.size() > position + 1) {
      queue.removeLast();
    }
    queue.add(url);
    position = queue.size() - 1;
  }

  public String back(int steps) {
    position = Math.max(0, position - steps);
    return queue.get(position);
  }

  public String forward(int steps) {
    position = Math.min(queue.size() - 1, position + steps);
    return queue.get(position);
  }
}
