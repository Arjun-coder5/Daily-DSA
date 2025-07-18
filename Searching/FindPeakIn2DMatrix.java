// File: FindPeakIn2DMatrix.java

public class FindPeakIn2DMatrix {
    public static int[] findPeakGrid(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        int low = 0, high = m - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int maxRow = 0;

            for (int i = 1; i < n; i++) {
                if (mat[i][mid] > mat[maxRow][mid]) maxRow = i;
            }

            boolean leftIsSmaller = (mid == 0 || mat[maxRow][mid] > mat[maxRow][mid - 1]);
            boolean rightIsSmaller = (mid == m - 1 || mat[maxRow][mid] > mat[maxRow][mid + 1]);

            if (leftIsSmaller && rightIsSmaller) return new int[]{maxRow, mid};
            else if (mid > 0 && mat[maxRow][mid - 1] > mat[maxRow][mid]) high = mid - 1;
            else low = mid + 1;
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[][] mat = {
            {10, 8, 10, 10},
            {14, 13, 12, 11},
            {15, 9, 11, 21},
            {16, 17, 19, 20}
        };
        int[] ans = findPeakGrid(mat);
        System.out.println("Peak at: [" + ans[0] + ", " + ans[1] + "]");
    }
}
