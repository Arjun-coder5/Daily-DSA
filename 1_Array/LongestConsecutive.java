import java.util.Scanner;

public class LongestConsecutive {

    // Helper method to check if a value exists in the array
    static boolean contains(int[] nums, int val){
        for(int num : nums){
            if(num == val){
                return true;
            }
        }
        return false;
    }

    // Method to find length of longest consecutive sequence (naive O(n^2) approach)
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int maxLength = 0;

        for(int i = 0; i < nums.length; i++){
            int currentLength = 1;
            int currentNum = nums[i];

            while(contains(nums, currentNum + 1)){
                currentNum += 1;
                currentLength++;
            }

            if(currentLength > maxLength){
                maxLength = currentLength;
            }
        }
        return maxLength;
    }

    // Main method to take input and output the result
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        LongestConsecutive sol = new LongestConsecutive();
        int result = sol.longestConsecutive(nums);

        System.out.println("Longest consecutive sequence length: " + result);

        sc.close();
    }
}
