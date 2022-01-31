package medium;

import java.util.HashMap;
import java.util.Map;

/*
1472. Design Browser History
https://leetcode.com/problems/design-browser-history/
 */
class BrowserHistory {
    Map<Integer, String> map;
    private int position = 1;
    private int maxHistory = 1;

    public BrowserHistory(String homepage) {
        map = new HashMap<>();
        map.put(position, homepage);
    }

    public void visit(String url) {
        position++;
        map.put(position, url);
        maxHistory = position;
    }

    public String back(int steps) {
        position = Math.max(position - steps, 1);
        return map.get(position);
    }

    public String forward(int steps) {
        position = Math.min(position + steps, maxHistory);
        return map.get(position);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */