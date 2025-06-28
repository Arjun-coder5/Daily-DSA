import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElementNby3 {

    public static List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int threshold = n / 3;

        List<Integer> result = new ArrayList<>();
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                if (count > threshold) {
                    result.add(nums[i - 1]);
                }
                count = 1;
            }
        }

        // Final group check
        if (count > threshold) {
            result.add(nums[n - 1]);
        }

        return result;
    }

    // ✅ Sample test
    public static void main(String[] args) {
        int[] nums1 = {3, 2, 3};
        int[] nums2 = {1};
        int[] nums3 = {1, 2};
        int[] nums4 = {1, 2, 2, 3, 2, 1, 1, 1};

        System.out.println("Test 1: " + majorityElement(nums1)); // Output: [3]
        System.out.println("Test 2: " + majorityElement(nums2)); // Output: [1]
        System.out.println("Test 3: " + majorityElement(nums3)); // Output: [1, 2]
        System.out.println("Test 4: " + majorityElement(nums4)); // Output: [1, 2]
    }
}
