
import java.util.Scanner;

public class Rotate_By_K_staps {

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // In case k is larger than array length

        reverse(nums, 0, n - 1);      // Reverse the entire array
        reverse(nums, 0, k - 1);      // Reverse first k elements
        reverse(nums, k, n - 1);      // Reverse remaining elements
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements in the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of rotations (k): ");
        int k = scanner.nextInt();

        rotate(nums, k);

        System.out.println("Array after rotation:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }
}
