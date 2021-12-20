package easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
1365. How Many Numbers Are Smaller Than the Current Number
https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 */
class Solution1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        List<Integer> collect = Arrays.stream(nums).sorted().boxed().collect(Collectors.toList());
        int[] r = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int index = collect.indexOf(nums[i]);
            r[i] = index == -1 ? 0 : index;
        }
        return r;
    }

}