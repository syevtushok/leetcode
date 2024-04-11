package org.esadev.neetcode.arrays.static_arrays.easy;

public class RemoveElements27 {

  public int removeElement(int[] nums, int val) {
    int index = 0; // initialize a first pointer

    for (int i = 0; i < nums.length; i++) { // iterate through the array
      if (nums[i] != val) { // checks if the current element is not equal to the value to remove
        nums[index++] = nums[i]; // increment the first pointer and set the current element to the new index
      }
    }

    return index; // return the size of the new array
  }

}
