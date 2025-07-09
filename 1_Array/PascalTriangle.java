/**
 * PascalTriangle.java
 *
 * Author: Arjun [Arjun-coder5]
 * Created on: [9-07-2025]
 *
 * Description:
 * This program generates the first 'numRows' of Pascal's Triangle.
 * Each element in the triangle is the sum of the two elements directly above it.
 *
 * LeetCode Problem: 118. Pascal's Triangle
 * Link: https://leetcode.com/problems/pascals-triangle/
 */

import java.util.*;

public class PascalTriangle {

    /**
     * Generates Pascal's Triangle up to the given number of rows.
     *
     * @param numRows Total number of rows to generate
     * @return List of rows representing Pascal's Triangle
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                // First and last positions are always 1
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    // Internal positions = sum of two values above
                    int left = triangle.get(i - 1).get(j - 1);
                    int right = triangle.get(i - 1).get(j);
                    row.add(left + right);
                }
            }

            triangle.add(row);
        }

        return triangle;
    }

    /**
     * Main method to test the generate function.
     */
    public static void main(String[] args) {
        PascalTriangle pt = new PascalTriangle();
        int numRows = 5;

        List<List<Integer>> result = pt.generate(numRows);

        // Print output
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
