import java.util.Arrays;

public class SwapTwoNumbers {
    public static void swap(int[] nums) {
        nums[0] ^= nums[1];
        nums[1] ^= nums[0];
        nums[0] ^= nums[1];
    }

    public static void main(String[] args) {
        int[] nums = {3, 4};
        swap(nums);
        System.out.println("Swapped numbers: " + Arrays.toString(nums));
    }
}
