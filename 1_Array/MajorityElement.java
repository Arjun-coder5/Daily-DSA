
public class MajorityElement {
    // Leetcode 169: Majority Element
// Author: Arjun
// Language: Java
// Tags: Array, Boyer-Moore Voting Algorithm
// Difficulty: Easy

    // Function to find the majority element using Boyer-Moore Voting Algorithm
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    // Sample driver code with user input
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        MajorityElement obj = new MajorityElement();
        int result = obj.majorityElement(nums);

        System.out.println("Majority Element: " + result);
        sc.close();
    }
}
