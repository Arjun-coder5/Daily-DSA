import java.util.*;

public class count {
    public static int findKRotation(List<Integer> arr) {
        int n = arr.size();
        int low = 0, high = n - 1;

        while (low <= high) {
            if (arr.get(low) <= arr.get(high)) return low;

            int mid = low + (high - low) / 2;
            int prev = (mid + n - 1) % n;
            int next = (mid + 1) % n;

            if (arr.get(mid) <= arr.get(prev) && arr.get(mid) <= arr.get(next)) return mid;

            if (arr.get(mid) >= arr.get(low)) low = mid + 1;
            else high = mid - 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(15, 18, 2, 3, 6, 12);
        System.out.println("Rotation Count: " + findKRotation(arr));
    }
}
