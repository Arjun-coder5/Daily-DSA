// ✅ Author: Arjun (GitHub: Arjun-coder5)
// ✅ Problem: Largest Subarray with 0 Sum
// ✅ Platform: GeeksforGeeks / Leetcode-style
// ✅ Approach: Prefix Sum + HashMap
// ✅ Time Complexity: O(n)
// ✅ Space Complexity: O(n)

import java.util.HashMap;
import java.util.Map;

public class LargestSubarrayWithZeroSum {

    // Function to find the length of the longest subarray with sum = 0
    public static int maxLen(int[] arr, int n) {
        // Map to store prefix sum and its earliest index
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            // If prefix sum becomes zero, update maxLen
            if (sum == 0) {
                maxLen = i + 1;
            }

            // If this sum is seen before, update maxLen
            if (map.containsKey(sum)) {
                int prevIndex = map.get(sum);
                maxLen = Math.max(maxLen, i - prevIndex);
            } else {
                // Store the first occurrence of the prefix sum
                map.put(sum, i);
            }
        }

        return maxLen;
    }

    // Main function to test the code
    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        int result = maxLen(arr, arr.length);
        System.out.println("✅ Length of the largest subarray with 0 sum: " + result);

        // More test cases
        int[] test1 = {1, 0, -4, 3, 1, 0};
        System.out.println("Test 2: " + maxLen(test1, test1.length)); // Output: 5

        int[] test2 = {2, 10, 4};
        System.out.println("Test 3: " + maxLen(test2, test2.length)); // Output: 0
    }
}
