public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] bananaPiles = {805306368, 805306368, 805306368};
        int hoursAvailable = 1000000000;

        Solution solution = new Solution();
        int minSpeed = solution.findMinEatingSpeed(bananaPiles, hoursAvailable);

        System.out.println("Minimum Eating Speed: " + minSpeed);  // Expected: 3
    }
}

class Solution {
    // Main method to find the minimum speed at which Koko can eat all bananas
    public int findMinEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = findMaxPile(piles);  // Upper bound: largest pile

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canFinishAll(piles, h, mid)) {
                high = mid - 1;  // Try slower speed
            } else {
                low = mid + 1;   // Need faster speed
            }
        }

        return low;  // The smallest valid speed
    }

    // Find the largest pile
    private int findMaxPile(int[] piles) {
        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        return max;
    }

    // Check if Koko can finish all bananas at speed 'k' within 'h' hours
    private boolean canFinishAll(int[] piles, int h, int k) {
        long totalHours = 0;  // Use long to avoid overflow

        for (int pile : piles) {
            totalHours += (pile + k - 1L) / k;  // Ceiling of pile/k
        }

        return totalHours <= h;
    }
}
