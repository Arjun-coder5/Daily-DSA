public class Find_Missing_Num {

    public int missingNumber(int[] nums) {
        int n = nums.length;

        // Step 1: Calculate expected sum of numbers from 0 to n using formula: n * (n + 1) / 2
        int expected_sum = n * (n + 1) / 2;

        // Step 2: Calculate actual sum of the elements in the array
        int actual_sum = 0;
        for (int i = 0; i < n; i++) {
            actual_sum += nums[i];
        }

        // Step 3: The missing number is the difference between expected and actual sums
        return expected_sum - actual_sum;
    }

    // Problem: Find the missing number from the array that contains numbers from 0 to n with one missing
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public static void main(String[] args) {
        Find_Missing_Num obj = new Find_Missing_Num();
        int[] nums = {0,1,3,4};
        System.out.println("Missing number is: " + obj.missingNumber(nums)); // Output: 2
    }
}
