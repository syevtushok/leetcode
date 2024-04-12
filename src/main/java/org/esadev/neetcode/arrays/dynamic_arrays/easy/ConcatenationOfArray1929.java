package org.esadev.neetcode.arrays.dynamic_arrays.easy;

public class ConcatenationOfArray1929 {

  public int[] getConcatenation(int[] nums) {
    int[] ans = new int[nums.length * 2];

    for (int i = 0; i < nums.length; i++) {
      ans[i] = nums[i];
      ans[i + nums.length] = nums[i];
    }

    return ans;
  }

}
