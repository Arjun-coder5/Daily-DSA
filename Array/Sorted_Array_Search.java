import java.util.Scanner;

public class Sorted_Array_Search {
     public static boolean searchInSorted(int[] arr, int k) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == k) {
                return true;
            } else if (arr[mid] < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
  public static void main(String[] args) {


/**
 * Sorted Array Search
 *
 * Given a sorted array and a number k,
 * return true if k is present in the array, otherwise false.
 *
 * Uses Binary Search algorithm.
 *
 * Author: Arjun
 */

    Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to search: ");
        int k = sc.nextInt();

        boolean found = searchInSorted(arr, k);
        System.out.println("Output: " + found);

        sc.close();
    }
}
