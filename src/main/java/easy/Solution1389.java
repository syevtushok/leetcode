package easy;

import java.util.ArrayList;
import java.util.List;

/*
1389. Create Target Array in the Given Order
https://leetcode.com/problems/create-target-array-in-the-given-order/
 */
class Solution1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        int length = nums.length;
        int[] target = new int[length];

        for (int i = 0; i < length; i++) {
            list.add(index[i], nums[i]);
        }

        for (int i = 0; i < length; i++) {
            target[i] = list.get(i);
        }

        return target;
    }
}