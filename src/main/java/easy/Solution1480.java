package easy;

import java.util.Arrays;

/**
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * <p>
 * Return the running sum of nums.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,4]
 * Output: [1,3,6,10]
 * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 * Example 2:
 * <p>
 * Input: nums = [1,1,1,1,1]
 * Output: [1,2,3,4,5]
 * Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
 * Example 3:
 * <p>
 * Input: nums = [3,1,2,10,1]
 * Output: [3,4,6,16,17]
 */
class Solution1480 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution1480().runningSum(new int[]{ 1, 2, 3, 4 })));
        System.out.println(Arrays.toString(new Solution1480().runningSumSecondApproach(new int[]{ 1, 2, 3, 4 })));
    }

    public int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        int totalSum = 0;

        for (int i : nums) {
            totalSum += i;
        }

        for (int i = 0; i < nums.length; i++) {
            int temp = nums.length - 1 - i;
            sum[temp] = totalSum;
            totalSum -= nums[temp];
        }

        return sum;
    }

    public int[] runningSumSecondApproach(int[] nums) {
        int[] sum = new int[nums.length];
        sum[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }

        return sum;
    }

}