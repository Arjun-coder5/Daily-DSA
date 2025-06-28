import java.util.Scanner;

/**
 * LeetCode Problem: 283. Move Zeroes
 * Difficulty: Easy
 *
 * Description:
 * Move all 0's to the end of an array while maintaining the order of non-zero elements.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * Author: Arjun
 */

public class Move_Zeroes {
    // Method to move all 0s to the end
    public void moveZeroes(int[] nums) {
        int insertPos = 0;

        // Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertPos] = nums[i];
                insertPos++;
            }
        }

        // Fill remaining positions with 0
        for (int i = insertPos; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    // Main method inside the same class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Move_Zeroes sol = new Move_Zeroes(); // create object

        // Take input
        System.out.print("Enter size of array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter array elements (integers):");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Call moveZeroes
        sol.moveZeroes(nums);

        // Print result
        System.out.println("Array after moving zeroes to the end:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
