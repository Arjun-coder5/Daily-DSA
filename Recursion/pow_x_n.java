public class pow_x_n {
    public static void main(String[] args) {
        double x = 2.0;
        int n = -2;

        System.out.println(myPow(x, n));  // Output: 0.25
    }

    public static double myPow(double x, int n) {
        long N = n;  // convert to long to avoid overflow for -2^31
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return fastPower(x, N);
    }

    private static double fastPower(double x, long n) {
        if (n == 0) return 1.0;

        double half = fastPower(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}
