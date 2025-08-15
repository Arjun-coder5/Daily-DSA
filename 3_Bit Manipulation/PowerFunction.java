public class PowerFunction {
    // Fast exponentiation: O(log n)
    public static double power(double x, int n) {
        long N = n;
        if (N < 0) { x = 1.0 / x; N = -N; }
        double ans = 1.0, base = x;
        while (N > 0) {
            if ((N & 1) == 1) ans *= base;
            base *= base;
            N >>= 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(power(2.0, 10));  // 1024.0
        System.out.println(power(2.0, -2));  // 0.25
        System.out.println(power(2.1, 3));   // ~9.261
    }
}
