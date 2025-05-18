
import java.util.Scanner;

/**
 * Author: Arjun
 * Question Link: https://www.geeksforgeeks.org/problems/multiples-in-reverse/
 * Description: This program prints the first 10 multiples of a number `n` in reverse order (from 10×n to 1×n).
 */

public class MultiplesInReverse {

    // Method to print the first 10 multiples of n in reverse
    public static void calculateMultiples(int n) {
        int i = 10;

        // Loop from 10 down to 1
        while (i >= 1) {
            System.out.print(i * n + " "); // Print the current multiple
            i--; // Decrement counter
        }
    }

    // Main method to take user input and call the method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt(); // Taking user input

        calculateMultiples(number); // Calling the method to print multiples

        sc.close(); // Closing the scanner
    }
}
