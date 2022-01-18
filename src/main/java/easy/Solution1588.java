package easy;

/*
1588. Sum of All Odd Length Subarrays
https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
 */
class Solution1588 {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int arraysLeft = i + 1;
            int arraysRight = arr.length - i;
            int oddArrays = (arraysLeft * arraysRight + 1) / 2;
            sum += arr[i] * oddArrays;
        }

        return sum;
    }
}

