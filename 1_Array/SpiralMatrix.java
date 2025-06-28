import java.util.*;

/**
 * Problem: Spiral Matrix (LeetCode #54)
 * Author: LeetCode
 * Link: https://leetcode.com/problems/spiral-matrix/
 * 
 * Given an m x n matrix, return all elements of the matrix in spiral order.
 */

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>(); 
        int n = matrix.length;       // Number of rows
        int m = matrix[0].length;    // Number of columns
        int top = 0, bottom = n - 1; // Initialize top and bottom boundaries
        int left = 0, right = m - 1; // Initialize left and right boundaries

        while (top <= bottom && left <= right) {
            // Traverse from left to right on top row
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++; // Move down the top boundary

            // Traverse from top to bottom on right column
            if (top <= bottom) {
                for (int i = top; i <= bottom; i++) {
                    result.add(matrix[i][right]);
                }
            }
            right--; // Move left the right boundary

            // Traverse from right to left on bottom row if valid
            if (top <= bottom && left <= right) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--; // Move up the bottom boundary
            }

            // Traverse from bottom to top on left column if valid
            if (top <= bottom && left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++; // Move right the left boundary
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read matrix dimensions from user
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        // Read matrix elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        SpiralMatrix sm = new SpiralMatrix();

        // Print spiral order traversal
        List<Integer> spiral = sm.spiralOrder(matrix);
        for (int val : spiral) {
            System.out.print(val + " ");
        }
        System.out.println();

        sc.close();
    }
}
