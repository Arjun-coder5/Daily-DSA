import java.util.*;

public class AggressiveCowsSolver {

    public static boolean canPlace(int[] stalls, int cows, int dist) {
        int count = 1, last = stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - last >= dist) {
                count++;
                last = stalls[i];
            }
        }
        return count >= cows;
    }

    public static int maxMinDistance(int[] stalls, int cows) {
        Arrays.sort(stalls);
        int low = 1, high = stalls[stalls.length - 1] - stalls[0], ans = 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (canPlace(stalls, cows, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] stalls = {1, 2, 8, 4, 9};
        int cows = 3;
        System.out.println("Max Min Distance: " + maxMinDistance(stalls, cows)); // Output: 3
    }
}
