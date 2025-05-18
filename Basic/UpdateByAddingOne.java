/**
 * Author: Arjun
 * Question Link: https://www.geeksforgeeks.org/problems/pass-by-value/
 * Name: Update by Adding One
 * Description: This program takes two integers `a` and `b`, increments `a` by 1 and `b` by 2,
 *              and returns the updated values in an array.
 */

public class UpdateByAddingOne {
    public static int[] updateByAddingOne(int a, int b) {
        int one = a + 1;
        int second = b + 1;
        return new int[] {one, second};
    }

    public static void main(String[] args) {
        int[] result = updateByAddingOne(5, 10); // example input
        System.out.println("Updated values: " + result[0] + ", " + result[1]);
    }
}
