package easy;

import java.util.ArrayList;
import java.util.List;

class Solution1313 {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i += 2) {
            int repeat = nums[i];

            for (int j = 0; j < repeat; j++) {
                result.add(nums[i + 1]);
            }
        }

        int[] integers = new int[result.size()];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = result.get(i);
        }


        return integers;
    }
}