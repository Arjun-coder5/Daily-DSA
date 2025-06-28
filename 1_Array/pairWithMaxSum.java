import java.util.Scanner;
public class pairWithMaxSum {
  // Problem: Find the maximum sum of any pair of adjacent elements
// Author: Arjun
// Language: Java
// Tags: Array, Sliding Window
// Difficulty: Easy





    // Function to find the pair with the maximum sum
    public int pairWithMaxSum(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return Integer.MIN_VALUE;
        }

        int max = arr[0] + arr[1];

        for (int i = 1; i < arr.length - 1; i++) {
            int sum = arr[i] + arr[i + 1];
            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }

    // Driver code with user input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        pairWithMaxSum obj = new pairWithMaxSum();
        int result = obj.pairWithMaxSum(arr);

        System.out.println("Maximum sum of adjacent pairs: " + result);
        sc.close();
    }
}


