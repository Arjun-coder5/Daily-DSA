public class SquareRoot {
    public static int sqrt(int x) {
        int low = 0, high = x, ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long square = (long) mid * mid;

            if (square == x) return mid;
            else if (square < x) {
                ans = mid;
                low = mid + 1;
            } else high = mid - 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int x = 27;
        System.out.println("Square Root (floor): " + sqrt(x));
    }
}
