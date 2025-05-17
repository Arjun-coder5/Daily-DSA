// Author: Arjun Sorout (GitHub: [Arjun-coder5](https://github.com/Arjun-coder5))

// ---

// ## Problem: Compare Two Numbers

// ### Description
// Given two integers `n` and `m`, compare them and return:

// - `"lesser"` if `n` is less than `m`
// - `"equal"` if `n` is equal to `m`
// - `"greater"` if `n` is greater than `m`

// ---

// ### Solution Link
// [GitHub Repository - Daily-DSA/Basic](https://github.com/Arjun-coder5/Daily-DSA/tree/main/Basic)

// ---

// ### Example




import java.util.Scanner;

class Solution {
    public static String compareNM(int n, int m) {
        if (n < m) {
            return "lesser";
        } else if (n == m) {
            return "equal";
        } else {
            return "greater";
        }
    }
}


public class Decission_Making {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (n): ");
        int n = sc.nextInt();

        System.out.print("Enter second number (m): ");
        int m = sc.nextInt();

        String result = Solution.compareNM(n, m);
        System.out.println(result);

        sc.close();
    }
}