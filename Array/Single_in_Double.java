public class Single_in_Double {

    public static int singleNumber(int[] nums) {
        int result = 0;

        // Traverse the array using a complete for loop
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i]; // XOR cancels duplicates
        }

        return result; // Final result is the number that appears only once
    }

  public static void main(String[] args) {
    
  
    /**
 * Leetcode Problem: 136. Single Number
 * 
 * Problem Statement:
 * Given a non-empty array of integers nums, every element appears twice except for one.
 * Find that single one.
 *
 * Constraints:
 * - Must implement a solution with linear runtime complexity (O(n)).
 * - Must use only constant extra space (O(1)).
 *
 * Example:
 * Input: [4,1,2,1,2]
 * Output: 4
 *
 * Explanation:
 * XOR of a number with itself is 0.
 * XOR of a number with 0 is the number itself.
 * All duplicates cancel out, leaving the unique number.
 */
 
    // Test case
      int[] nums = {4, 1, 2, 1, 2};
        System.out.println("The single number is: " + singleNumber(nums)); // Output: 4
    }
}

