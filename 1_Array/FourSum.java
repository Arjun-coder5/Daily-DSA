import java.util.*;

public class FourSum {

    /**
     * Finds all unique quadruplets in the array that sum up to the target value.
     * @param nums the input array of integers
     * @param target the target sum
     * @return list of unique quadruplets that sum to target
     */
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort the array

        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
            // Skip duplicate i values
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < n - 2; j++) {
                // Skip duplicate j values
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    // Use long to avoid integer overflow
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        // Valid quadruplet found
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;

                        // Skip duplicates for left pointer
                        while (left < right && nums[left] == nums[left - 1]) left++;

                        // Skip duplicates for right pointer
                        while (left < right && nums[right] == nums[right + 1]) right--;

                    } else if (sum < target) {
                        left++; // Increase sum
                    } else {
                        right--; // Decrease sum
                    }
                }
            }
        }

        return result;
    }

    // Driver code for testing
    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;

        List<List<Integer>> result = fourSum(nums, target);

        System.out.println("Quadruplets that sum to " + target + ":");
        for (List<Integer> quad : result) {
            System.out.println(quad);
        }
    }
}
