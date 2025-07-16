public class SmallestDivisorSolver {

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 9};
        int threshold = 6;

        Solution sol = new Solution();
        int result = sol.smallestDivisor(nums, threshold);

        System.out.println("Smallest Divisor: " + result);  // Output: 5
    }
}

class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1, high = getmax(nums);
        int answer = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isValid(nums, threshold, mid)) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return answer;
    }

    public static int getmax(int[] nums) {
        int ans = nums[0];
        for (int val : nums) {
            ans = Math.max(ans, val);
        }
        return ans;
    }

    public static boolean isValid(int[] nums, int threshold, int divisor) {
        int result = 0;
        for (int num : nums) {
            result += (num + divisor - 1) / divisor; // same as ceil(num/divisor)
        }
        return result <= threshold;
    }
}
