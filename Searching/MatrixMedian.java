// File: MatrixMedian.java

public class MatrixMedian {
    public static int findMedian(int[][] matrix, int R, int C) {
        int low = 1, high = 2000;

        while (low <= high) {
            int mid = (low + high) / 2;
            int count = 0;

            for (int i = 0; i < R; i++) {
                count += countSmallerOrEqual(matrix[i], mid);
            }

            if (count <= (R * C) / 2) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    public static int countSmallerOrEqual(int[] row, int target) {
        int low = 0, high = row.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (row[mid] <= target) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 3, 5},
            {2, 6, 9},
            {3, 6, 9}
        };
        System.out.println(findMedian(mat, 3, 3)); // 5
    }
}
