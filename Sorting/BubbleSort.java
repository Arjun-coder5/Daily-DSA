public class BubbleSort {

    // Function to perform Bubble Sort
    static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Outer loop for number of passes
        for (int i = 0; i < n - 1; i++) {
            // Inner loop for comparisons in each pass
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if elements are in wrong order
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Function to print the array
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main function
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};

        System.out.println("Original Array:");
        printArray(arr);

        // Call bubble sort
        bubbleSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
