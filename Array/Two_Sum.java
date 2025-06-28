// Two_Sum.java
import java.util.Scanner;

public class Two_Sum {

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        // Brute force approach to check all pairs
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        // If no valid pair is found
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking array size input
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Taking array elements input
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Taking target input
        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        int[] result = twoSum(nums, target);

        if (result[0] == -1) {
            System.out.println("No valid pair found.");
        } else {
            System.out.println("Indices of the elements that sum to target: " + result[0] + " and " + result[1]);
        }

        sc.close();
    }
}
