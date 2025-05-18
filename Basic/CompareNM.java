/**
 * Author: Arjun
 * Question Link: https://www.geeksforgeeks.org/problems/compare-two-numbers/
 * 
 * Description:
 * Compares two integers and returns "lesser", "equal", or "greater".
 */
public class CompareNM {

    public static String compare(int n, int m) {
        if (n < m) {
            return "lesser";
        } else if (n == m) {
            return "equal";
        } else {
            return "greater";
        }
    }

    public static void main(String[] args) {
        System.out.println(compare(5, 10));  // lesser
        System.out.println(compare(7, 7));   // equal
        System.out.println(compare(9, 3));   // greater
    }
}
