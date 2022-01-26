package easy;

/*
941. Valid Mountain Array
https://leetcode.com/problems/valid-mountain-array/
 */
public class Solution941 {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3 || arr[0] >= arr[1]) {
            return false;
        }
        if (arr[arr.length - 1] >= arr[arr.length - 2]) {
            return false;
        }
        boolean isPick = false;

        for (int i = 0; i < arr.length - 1; i++) {
            if (!isPick) {
                if (arr[i] == arr[i + 1]) {
                    return false;
                } else if (arr[i] > arr[i + 1]) {
                    isPick = true;
                }

            } else if (arr[i] <= arr[i + 1]) {
                return false;
            }
        }

        return true;

    }
}