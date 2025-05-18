/**
 * Name: Find Nth Fibonacci Number
 * Description: This program calculates the nth Fibonacci number using an iterative approach.
 *              It takes an integer input n and prints the nth Fibonacci number.
 * Author: Arjun
 * Link: https://www.geeksforgeeks.org/program-for-nth-fibonacci-number/
 */

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println(0);
            sc.close();
            return;
        } else if (n == 1) {
            System.out.println(1);
            sc.close();
            return;
        }

        int a = 0;
        int b = 1;
        int temp = 0;

        for (int i = 2; i <= n; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }

        System.out.println(temp); // Print only the nth Fibonacci number
        sc.close();
    }
}
