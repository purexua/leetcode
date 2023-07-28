// Source : https://leetcode.com/problems/3sum/
// Author : purexua
// Date   : 2023-07-28

/********************************************************************************** 
* 
* Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? 
* Find all unique triplets in the array which gives the sum of zero.
* 
* Note:
* 
* Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)
* The solution set must not contain duplicate triplets.
* 
*     For example, given array S = {-1 0 1 2 -1 -4},
* 
*     A solution set is:
*     (-1, 0, 1)
*     (-1, -1, 2)
* 
*               
**********************************************************************************/

class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();

    // Sort the array
    Arrays.sort(nums);

    for (int i = 0; i < nums.length - 2; i++) {
      // Skip duplicate elements for i
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }

      int j = i + 1;
      int k = nums.length - 1;

      while (j < k) {
        int sum = nums[i] + nums[j] + nums[k];

        if (sum == 0) {
          // Found a triplet with zero sum
          ans.add(Arrays.asList(nums[i], nums[j], nums[k]));

          // Skip duplicate elements for j
          while (j < k && nums[j] == nums[j + 1]) {
            j++;
          }

          // Skip duplicate elements for k
          while (j < k && nums[k] == nums[k - 1]) {
            k--;
          }

          // Move the pointers
          j++;
          k--;
        } else if (sum < 0) {
          // Sum is less than zero, increment j to increase the sum
          j++;
        } else {
          // Sum is greater than zero, decrement k to decrease the sum
          k--;
        }
      }
    }
    return ans;
  }
}