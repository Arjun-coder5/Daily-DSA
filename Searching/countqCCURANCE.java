public class countqCCURANCE {

    // Method to find the first occurrence of target
    public static int findFirst(int[] nums, int target) {
        int start = 0, end = nums.length - 1, result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                result = mid;
                end = mid - 1; // move left
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    // Method to find the last occurrence of target
    public static int findLast(int[] nums, int target) {
        int start = 0, end = nums.length - 1, result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                result = mid;
                start = mid + 1; // move right
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    // Main method to count the frequency of target in nums[]
    public static int countFrequency(int[] nums, int target) {
        int first = findFirst(nums, target);
        if (first == -1) return 0; // target not found
        int last = findLast(nums, target);
        return last - first + 1;
    }

    // Driver code
    public static void main(String[] args) {
        int[] nums = {2, 4, 4, 4, 5, 6, 7};
        int target = 4;
        int count = countFrequency(nums, target);
        System.out.println("Frequency of " + target + " is: " + count);
    }
}
