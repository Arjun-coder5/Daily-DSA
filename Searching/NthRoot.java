public class NthRoot {
    public static int nthRoot(int n, int m) {
        int low = 1, high = m;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long pow = power(mid, n);

            if (pow == m) return mid;
            else if (pow < m) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    private static long power(int base, int exp) {
        long result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
            if (result > Integer.MAX_VALUE) return Integer.MAX_VALUE; // overflow guard
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 3, m = 27;
        System.out.println("Nth Root: " + nthRoot(n, m));
    }
}
