import java.util.Scanner;
public class NextPermutation {
  // Leetcode 31: Next Permutation
// Author: Arjun
// Language: Java
// Tags: Array, Two-Pointer, Permutations
// Difficulty: Medium





    // Function to compute next lexicographical permutation
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = -1;

        // 🔹 Step 1: Find the first decreasing element from the end
        for (int k = n - 2; k >= 0; k--) {
            if (nums[k] < nums[k + 1]) {
                i = k;
                break;
            }
        }

        // 🔹 Step 2: If found, find next larger element to the right and swap
        if (i != -1) {
            for (int j = n - 1; j > i; j--) {
                if (nums[j] > nums[i]) {
                    // Swap
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    break;
                }
            }
        }

        // 🔹 Step 3: Reverse the subarray from i+1 to end
        int left = i + 1;
        int right = n - 1;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    // Driver code for input and output
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        NextPermutation obj = new NextPermutation();
        obj.nextPermutation(nums);

        System.out.print("Next Permutation: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}


