public class KokoEatingBananasSolver {

    public static boolean canEat(int[] piles, int speed, int h) {
        int time = 0;
        for (int pile : piles)
            time += (pile + speed - 1) / speed;
        return time <= h;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = Integer.MIN_VALUE;
        for (int pile : piles)
            high = Math.max(high, pile);

        int ans = high;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (canEat(piles, mid, h)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        System.out.println("Min Eating Speed: " + minEatingSpeed(piles, h)); // Output: 4
    }
}
