import java.util.Scanner;
public class MaxProfit {
  // Leetcode 121: Best Time to Buy and Sell Stock
// Author: Arjun
// Language: Java
// Tags: Array, Greedy, One Pass
// Difficulty: Easy





    // Function to calculate the maximum profit
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }

            int profit = price - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    // Driver code with user input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("Price array can't be empty.");
            return;
        }

        int[] prices = new int[n];
        System.out.println("Enter prices for " + n + " days:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        MaxProfit obj = new MaxProfit();
        int result = obj.maxProfit(prices);

        System.out.println("Maximum Profit: " + result);
        sc.close();
    }
}


