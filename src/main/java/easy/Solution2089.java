package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution2089 {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();

        int i = 0;
        while (i < nums.length && nums[i] <= target) {
            if (nums[i] == target) {
                list.add(i);
            }
            i++;
        }

        return list;
    }
}