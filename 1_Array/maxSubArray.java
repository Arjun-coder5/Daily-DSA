import java.util.Scanner;
public class maxSubArray {
  // Leetcode 53: Maximum Subarray (Kadane's Algorithm)
// Author: Arjun
// Language: Java
// Tags: Array, Dynamic Programming
// Difficulty: Medium

    // Function to return the maximum subarray sum using Kadane's Algorithm
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int cSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (cSum < 0) {
                cSum = nums[i];
            } else {
                cSum += nums[i];
            }

            if (cSum > max) {
                max = cSum;
            }
        }

        return max;
    }

    // Driver code with user input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        maxSubArray obj = new maxSubArray();
        int result = obj.maxSubArray(nums);

        System.out.println("Maximum Subarray Sum: " + result);
        sc.close();
    }
}


