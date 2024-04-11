package org.esadev.neetcode.arrays.static_arrays.easy;

public class RemoveDuplicatesFromSortedArray26 {

  public int removeDuplicates(int[] nums) {
    int index = 0; // initialize a first pointer

    for (int i = 0; i < nums.length; i++) { // iterate through the array
      if (nums[index] != nums[i]) { // checks if the current element is not equal to the previous element
        nums[++index] = nums[i]; // increment the first pointer and set the current element to the new index
      }
    }

    return index + 1; // return the size of the new array
  }

}
