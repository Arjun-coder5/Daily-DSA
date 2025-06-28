public class Second_Largest {
  
  public static int getSecondLargest(int[] arr) {
        if (arr.length < 2) return -1; // Not enough elements

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

  /**
 * 🔍 Question: Find the Second Largest Element in an Array
 * 📎 Link: [Update with your problem link, e.g., https://www.geeksforgeeks.org/find-second-largest-element-array/]
 * 👨‍💻 Author: Arjun
 */

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int result = getSecondLargest(arr);
        System.out.println("Second Largest Element: " + result);
    }
}





 