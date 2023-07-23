// Source : https://leetcode.com/problems/intersection-of-two-arrays-ii/
// Author : Purexua
// Date   : 2023-07-23

/***************************************************************************************
 *
 * Given two arrays, write a function to compute their intersection.
 *
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
 *
 * Note:
 * Each element in the result should appear as many times as it shows in both arrays.
 * The result can be in any order.
 *
 * Follow up:
 * How to optimize if the given array is sorted?   双指针移动
 ***************************************************************************************/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
  public int[] intersect(int[] nums1, int[] nums2) {
    Map<Integer, Integer> map = new HashMap<>();
    ArrayList<Integer> arr = new ArrayList<>();

    int i = 0;
    while (i < nums1.length) {
      if (map.containsKey(nums1[i])) {
        map.put(nums1[i], map.get(nums1[i]) + 1);
      } else {
        map.put(nums1[i], 1);
      }
      i++;
    }
    for (int num : nums2) {
      if (map.containsKey(num) && map.get(num) > 0) {
        map.put(num, map.get(num) - 1);
        arr.add(num);
      }
    }
    int[] output = new int[arr.size()];
    int k = 0;
    while (k < arr.size()) {
      output[k] = arr.get(k);
      k++;
    }
    return output;
  }
}