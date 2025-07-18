// File: RowWithMaxOnes.java

public class RowWithMaxOnes {
    public static int rowWithMax1s(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int maxRow = -1, j = m - 1;

        for (int i = 0; i < n; i++) {
            while (j >= 0 && matrix[i][j] == 1) {
                j--;
                maxRow = i;
            }
        }
        return maxRow;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {0, 0, 0, 1},
            {0, 1, 1, 1},
            {1, 1, 1, 1},
            {0, 0, 0, 0}
        };
        System.out.println(rowWithMax1s(mat)); // Output: 2
    }
}
