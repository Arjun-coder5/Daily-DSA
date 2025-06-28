import java.util.HashMap;

public class maximum_length_of_subArray {
  
    public int longestSubarray(int[] arr, int k) {
        int n = arr.length;
        int maxLength = 0;
        int prefixSum = 0;

        // HashMap to store prefix sums and their earliest indices
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0, -1);  // prefix sum 0 at index -1 (helps with subarrays starting at index 0)

        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];

            // Check if there is a prefixSum - k already seen
            if (prefixSumMap.containsKey(prefixSum - k)) {
                int startIndex = prefixSumMap.get(prefixSum - k);
                int currentLength = i - startIndex;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
            }

            // Store the prefixSum only if not already present to keep earliest index
            prefixSumMap.putIfAbsent(prefixSum, i);
        }

        return maxLength;
    }

    // Optional main method for testing
    public static void main(String[] args) {
        maximum_length_of_subArray sol = new maximum_length_of_subArray();
        int[] arr1 = {10, 5, 2, 7, 1, -10};
        int k1 = 15;
        System.out.println(sol.longestSubarray(arr1, k1));  // Output: 6

        int[] arr2 = {-5, 8, -14, 2, 4, 12};
        int k2 = -5;
        System.out.println(sol.longestSubarray(arr2, k2));  // Output: 5

        int[] arr3 = {10, -10, 20, 30};
        int k3 = 5;
        System.out.println(sol.longestSubarray(arr3, k3));  // Output: 0
    }

  }