public class Count_good_numbers {

    static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        long n = 50; // Test case
        System.out.println("Good digit strings of length " + n + " = " + countGoodNumbers(n));
    }

    public static int countGoodNumbers(long n) {
        long even = (n + 1) / 2; // Even index positions
        long odd = n / 2;        // Odd index positions

        long evenPow = power(5, even); // 5 options for even positions
        long oddPow = power(4, odd);   // 4 options for odd positions

        return (int)((evenPow % MOD) * (oddPow % MOD) % MOD); // safe multiplication
    }

    private static long power(long base, long exp) {
        if (exp == 0) return 1;

        long half = power((base * base) % MOD, exp / 2);

        if (exp % 2 == 1) {
            return (base * half) % MOD;
        } else {
            return half;
        }
    }
}
