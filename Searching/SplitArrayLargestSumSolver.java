public class SplitArrayLargestSumSolver {

    public static boolean canSplit(int[] nums, int maxSum, int k) {
        int subarrays = 1, currentSum = 0;
        for (int num : nums) {
            if (currentSum + num > maxSum) {
                subarrays++;
                currentSum = num;
            } else {
                currentSum += num;
            }
        }
        return subarrays <= k;
    }

    public static int splitArray(int[] nums, int k) {
        int low = Integer.MIN_VALUE, high = 0;
        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }

        int ans = high;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (canSplit(nums, mid, k)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;
        System.out.println("Split Array Largest Sum: " + splitArray(nums, k)); // Output: 18
    }
}
