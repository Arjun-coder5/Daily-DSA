public class Maximum_Consecutive_Ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;      // Track the max consecutive ones found so far
        int currentCount = 0;  // Track the current streak of ones
        
        for (int num : nums) {
            if (num == 1) {
                currentCount++;           // Continue counting consecutive ones
                if (currentCount > maxCount) {
                    maxCount = currentCount; // Update max if current streak is longer
                }
            } else {
                currentCount = 0;        // Reset streak when a zero is encountered
            }
        }
        
        return maxCount;
    }

  
  public static void main(String[] args) {
    


    /**
 * Solution to find the maximum number of consecutive 1s in the given binary array.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
Maximum_Consecutive_Ones solution = new Maximum_Consecutive_Ones();

        int[] nums1 = {1, 1, 0, 1, 1, 1};
        System.out.println("Max consecutive ones: " + solution.findMaxConsecutiveOnes(nums1));  // Output: 3

        int[] nums2 = {1, 0, 1, 1, 0, 1};
        System.out.println("Max consecutive ones: " + solution.findMaxConsecutiveOnes(nums2));  // Output: 2

        int[] nums3 = {0, 0, 0, 0};
        System.out.println("Max consecutive ones: " + solution.findMaxConsecutiveOnes(nums3));  // Output: 0
    }
}


