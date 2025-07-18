public class RowWithMax1s {

    // Function to find the row with the maximum number of 1s
    public static int rowWithMax1s(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int maxRowIndex = -1;
        int j = m - 1;

        for (int i = 0; i < n; i++) {
            while (j >= 0 && arr[i][j] == 1) {
                j--;
                maxRowIndex = i;
            }
        }
        return maxRowIndex;
    }

    // Main function to test
    public static void main(String[] args) {
        int[][] arr = {
            {0, 1, 1, 1},
            {0, 0, 1, 1},
            {1, 1, 1, 1},
            {0, 0, 0, 0}
        };

        int result = rowWithMax1s(arr);
        System.out.println("Row with maximum 1s is: " + result);
    }
}
