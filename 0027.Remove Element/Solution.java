// Source : https://leetcode.com/problems/remove-element/
// Author : purexua
// Date   : 2023-07-28

/**********************************************************************************
 *
 * Given an array and a value, remove all instances of that value in place and return the new length.
 *
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 *
 *
 **********************************************************************************/
class Solution {
  public int removeElement(int[] nums, int val) {
    // Counter for keeping track of elements other than val
    int count = 0;
    // Loop through all the elements of the array
    for (int i = 0; i < nums.length; i++) {
      // If the element is not val
      if (nums[i] != val) {
        nums[count++] = nums[i];
      }
    }
    return count;
  }
}