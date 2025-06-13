/*
 * Insertion Sort in Java
 * Author: Arjun 
 * Description: A simple implementation of insertion sort algorithm using shifting
 * Time Complexity: O(n^2) in worst case, O(n) in best case (already sorted)
 * Space Complexity: O(1) - in-place sorting
 */

public class InsertionSort {

    // Function to sort the array using insertion sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];  // Element to be inserted
            int j = i - 1;

            // Shift elements of arr[0...i-1] that are greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];  // Shift element right
                j--;
            }

            // Insert the key into its correct position
            arr[j + 1] = key;
        }
    }

    // Utility function to print the array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Main method to test insertion sort
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("Original Array:");
        printArray(arr);

        insertionSort(arr);  // Sort the array

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
