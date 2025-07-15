public class SingleElement {
    public static int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length - 2;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == nums[mid ^ 1]) low = mid + 1;
            else high = mid - 1;
        }
        return nums[low];
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 5, 5};
        System.out.println("Single Element: " + singleNonDuplicate(nums));
    }
}
