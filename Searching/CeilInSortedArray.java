// File: CeilInSortedArray.java
public class CeilInSortedArray {
    public static int findCeil(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int res = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] >= x){
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int x = 11;
        System.out.println("Ceil Index: " + findCeil(arr, x));
    }
}
