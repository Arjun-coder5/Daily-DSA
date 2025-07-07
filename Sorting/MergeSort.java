public class MergeSort {

    // ✅ Merge Sort Function
    public static void mergeSort(int arr[], int l, int r) {
        int[] temp = new int[arr.length];  // shared temp array
        mergeSortUtil(arr, l, r, temp);
    }

    // ✅ Utility Function for Recursion
    static void mergeSortUtil(int arr[], int l, int r, int[] temp) {
        if (l >= r) return;

        int m = l + (r - l) / 2;
        mergeSortUtil(arr, l, m, temp);
        mergeSortUtil(arr, m + 1, r, temp);
        merge(arr, l, m, r, temp);
    }

    // ✅ Merge Two Sorted Halves
    static void merge(int[] arr, int l, int m, int r, int[] temp) {
        int i = l;
        int j = m + 1;
        int k = l;

        while (i <= m && j <= r) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= m) {
            temp[k++] = arr[i++];
        }

        while (j <= r) {
            temp[k++] = arr[j++];
        }

        for (int x = l; x <= r; x++) {
            arr[x] = temp[x];
        }
    }

    // ✅ Main Function
    public static void main(String[] args) {
        int[] arr = {6, 4, 2, 8, 3, 1, 5};
        int n = arr.length;

        mergeSort(arr, 0, n - 1);  // Call Merge Sort

        // Print sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
