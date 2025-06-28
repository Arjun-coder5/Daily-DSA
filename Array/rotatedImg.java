import java.util.Scanner;

public class rotatedImg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the matrix (n): ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter the elements of the matrix row-wise:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original matrix:");
        printMatrix(matrix);

        rotate(matrix);

        System.out.println("Matrix after 90 degrees clockwise rotation:");
        printMatrix(matrix);

        sc.close();
    }

    // Function to rotate the matrix by 90 degrees clockwise
    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose the matrix (swap matrix[i][j] with matrix[j][i])
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    // Helper function to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
