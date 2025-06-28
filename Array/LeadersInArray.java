import java.util.*;
public class LeadersInArray {
  // Problem: Find Leaders in an array
// Author: Arjun
// Language: Java
// Tags: Array, Greedy
// Difficulty: Easy





    // Method to find leaders in the array
    public List<Integer> leaders(int[] arr) {
        int n = arr.length;
        List<Integer> res = new ArrayList<>();

        int max = arr[n - 1];
        res.add(max); // Last element is always a leader

        // Traverse from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= max) {
                max = arr[i];
                res.add(max);
            }
        }

        // Reverse the result to print from left to right
        Collections.reverse(res);
        return res;
    }

    // Driver code for user input and output
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        LeadersInArray obj = new LeadersInArray();
        List<Integer> leaders = obj.leaders(arr);

        System.out.println("Leaders in the array:");
        for(int leader : leaders){
            System.out.print(leader + " ");
        }

        sc.close();
    }
}


