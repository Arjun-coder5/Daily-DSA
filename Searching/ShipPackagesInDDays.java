public class ShipPackagesInDDays {

    public static boolean canShip(int[] weights, int capacity, int days) {
        int total = 0, requiredDays = 1;
        for (int weight : weights) {
            if (total + weight > capacity) {
                requiredDays++;
                total = weight;
            } else {
                total += weight;
            }
        }
        return requiredDays <= days;
    }

    public static int shipWithinDays(int[] weights, int days) {
        int low = 0, high = 0;
        for (int weight : weights) {
            low = Math.max(low, weight);
            high += weight;
        }

        int ans = high;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (canShip(weights, mid, days)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] weights = {1,2,3,1,1};
        int days = 4;
        System.out.println("Min Capacity: " + shipWithinDays(weights, days)); // Output: 3
    }
}
