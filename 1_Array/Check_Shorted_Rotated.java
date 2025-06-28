public class Check_Shorted_Rotated {
  
    public static boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Circular comparison using modulo
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        // Valid only if there's at most one rotation point
        return count <= 1;
    }

  /*
 * Problem: 1752. Check if Array Is Sorted and Rotated
 * Platform: LeetCode
 * Link: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
 * Author: Arjun
 * 
 * Description:
 *   Given an array nums, return true if the array was originally sorted in non-decreasing order,
 *   then rotated some number of positions (including zero). Otherwise, return false.
 * 
 * Approach:
 *   - Traverse the array and count how many times nums[i] > nums[(i+1)%n].
 *   - If this count is more than 1, then it can't be sorted and rotated.
 *   - Return true only if count <= 1.
 */

    // Sample test
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        System.out.println("Is Sorted and Rotated? " + check(nums)); // Output: true
    }
}


