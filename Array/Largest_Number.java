
import java.util.Scanner;

public class Largest_Number {

    public static int findLargest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * Problem: Find the Largest Element in an Array Link:
     * https://example.com/find-largest-element <-- Replace with actual question
     * link Author: Arjun
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Array size must be a positive integer.");
            scanner.close();
            return;
        }

        int[] array = new int[size];

        System.out.println("Enter " + size + " integer values:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int largestElement = findLargest(array);
        System.out.println("The largest element in the array is: " + largestElement);

        scanner.close();
    }
}
