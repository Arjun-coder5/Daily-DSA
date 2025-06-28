import java.util.Scanner;

public class Short_Colour {
  public static void main(String[] args) {
    
  // Leetcode 75: Sort Colors (Dutch National Flag problem)
// Author: Arjun
// Language: Java
// Tags: Array, Two Pointers
// Difficulty: Medium
Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        // Input array elements (only 0, 1, 2)
        System.out.println("Enter " + n + " elements (0, 1, or 2 only):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Sort the colors
        sortColors(nums);

        // Output the sorted array
        System.out.print("Sorted colors: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    // Dutch National Flag Algorithm
    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            switch (nums[mid]) {
                case 0:
                    swap(nums, low++, mid++);
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums, mid, high--);
                    break;
            }
        }
    }

    // Helper function to swap elements
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

