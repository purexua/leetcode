// Source : https://leetcode.com/problems/search-in-rotated-sorted-array/
// Inspired by : https://leetcode.com/problems/search-in-rotated-sorted-array/solutions/3416630/c-java-python-javascript-fully-explained-binary-search/
// Author : Purexua
// Date   : 2023-07-22

/**********************************************************************************
 *
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 *
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 *
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 *
 * You may assume no duplicate exists in the array.
 *
 **********************************************************************************/

 class Solution {
  public int search(int[] nums, int target) {
      int start = 0, end = nums.length - 1;
      int mid = (start + end) / 2;
      while (start <= end) {
          mid = (start + end) / 2;
          if (target == nums[mid]) {
              return mid;
          }
          if (nums[start] <= nums[mid]) {
              if (nums[start] <= target && nums[mid] >= target) {
                  end = mid - 1;
              } else {
                  start = mid + 1;
              }
          } else {
              if (nums[end] >= target && nums[mid] <= target) {
                  start = mid + 1;
              } else {
                  end = mid - 1;
              }
          }
      }
      return -1;
  }
}