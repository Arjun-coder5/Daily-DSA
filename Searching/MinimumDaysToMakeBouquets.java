public class MinimumDaysToMakeBouquets {

    public static void main(String[] args) {
        int[] bloomDay = {1, 10, 3, 10, 2};
        int m = 3;
        int k = 1;

        Solution solution = new Solution();
        int result = solution.minDays(bloomDay, m, k);

        System.out.println("Minimum days to make " + m + " bouquets: " + result);
        // Output should be: 3
    }
}

class Solution {

    /**
     * Finds the minimum number of days to make m bouquets,
     * each containing k adjacent flowers that have bloomed.
     */
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;

        // 🔴 Edge Case: Not enough flowers
        if ((long) m * k > n) return -1;

        int low = 1;
        int high = getMax(bloomDay);
        int answer = -1;

        // 🟢 Binary Search to find the minimum valid day
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canMakeBouquets(bloomDay, m, k, mid)) {
                answer = mid;
                high = mid - 1;  // Try earlier
            } else {
                low = mid + 1;   // Need to wait more
            }
        }

        return answer;
    }

    /**
     * Checks if it is possible to make at least m bouquets on or before a given day.
     */
    private boolean canMakeBouquets(int[] bloomDay, int m, int k, int day) {
        int bouquets = 0;
        int flowers = 0;

        for (int bloom : bloomDay) {
            if (bloom <= day) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0; // Reset if flower hasn't bloomed
            }
        }

        return bouquets >= m;
    }

    /**
     * Returns the maximum value in the bloomDay array.
     */
    private int getMax(int[] bloomDay) {
        int max = 0;
        for (int day : bloomDay) {
            max = Math.max(max, day);
        }
        return max;
    }
}
