class Solution {
   
    public void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
              
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
}

public class InsertionSortMain {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};

        
        Solution sol = new Solution();
        sol.insertionSort(arr);  

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
