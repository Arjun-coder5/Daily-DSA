// File: BinarySearchClassic.java
public class BinarySearchClassic {
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args){
        int[] nums = {1, 3, 5, 7, 9};
        int target = 5;
        System.out.println("Index: " + search(nums, target));
    }
}
