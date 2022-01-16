package easy;

import java.util.ArrayList;
import java.util.List;

/*
1656. Design an Ordered Stream
https://leetcode.com/problems/design-an-ordered-stream/
 */
class OrderedStream1656 {
    private final String[] arr;
    private int pointer;

    public OrderedStream1656(int n) {
        pointer = 0;
        arr = new String[n];
    }

    public List<String> insert(int idKey, String value) {
        arr[idKey - 1] = value;

        List<String> list = new ArrayList<>();

        for (int i = pointer; i < arr.length; i++) {
            if (arr[pointer] == null) {
                break;
            }
            list.add(arr[pointer++]);
        }

        return list;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */