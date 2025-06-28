import java.util.Scanner;

public class Remove_Duplicate_Conut_it {
   public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int j = 0; // Pointer to track position of unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i]; // Overwrite duplicate
            }
        }

        return j + 1; // Number of unique elements
    } 
// Author: Arjun
// Problem: 26. Remove Duplicates from Sorted Array
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of sorted array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int k = removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        scanner.close();
    }
}

    
