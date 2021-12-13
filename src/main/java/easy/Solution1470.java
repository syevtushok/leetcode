package easy;

import java.util.Arrays;

/**
 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
 * <p>
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,5,1,3,4,7], n = 3
 * Output: [2,3,5,4,1,7]
 * Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
 * Example 2:
 * <p>
 * Input: nums = [1,2,3,4,4,3,2,1], n = 4
 * Output: [1,4,2,3,3,2,4,1]
 * Example 3:
 * <p>
 * Input: nums = [1,1,2,2], n = 2
 * Output: [1,2,1,2]
 */
class Solution1470 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution1470().shuffle(new int[]{ 2, 5, 1, 3, 4, 7 }, 3)));
    }

    public int[] shuffle(int[] nums, int n) {
        int[] array = new int[nums.length];
        int index = 0;
        for (int i = 0; i < n; i++) {
            array[index] = nums[i];
            array[index + 1] = nums[n + i];
            index += 2;
        }

        return array;
    }
}