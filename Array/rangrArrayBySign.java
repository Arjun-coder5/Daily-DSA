import java.util.Scanner;
public class rangrArrayBySign {
  // Leetcode 2149: Rearrange Array Elements by Sign
// Author: Arjun
// Language: Java
// Tags: Array, Two-Pointer
// Difficulty: Medium





    // Function to rearrange array elements by sign alternately
    public int[] rearrangeArray(int[] nums) {
        int len = nums.length;
        int[] positive = new int[len / 2];
        int[] negative = new int[len / 2];
        int p = 0, n = 0;

        // Separate positive and negative elements
        for (int num : nums) {
            if (num > 0) {
                positive[p++] = num;
            } else {
                negative[n++] = num;
            }
        }

        // Rearrange: alternate positive and negative
        int[] result = new int[len];
        int po = 0, ng = 0;
        for (int i = 0; i < len; i++) {
            if (i % 2 == 0) {
                result[i] = positive[po++];
            } else {
                result[i] = negative[ng++];
            }
        }

        return result;
    }

    // Driver code with user input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements (even size only): ");
        int n = sc.nextInt();

        if (n % 2 != 0) {
            System.out.println("Array must contain even number of elements (equal positives and negatives).");
            return;
        }

        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements (equal number of +ve and -ve):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        rangrArrayBySign obj = new rangrArrayBySign();
        int[] result = obj.rearrangeArray(nums);

        System.out.print("Rearranged Array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}


