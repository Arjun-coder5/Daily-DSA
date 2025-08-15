public class DivideWithoutOperators {
    // Divide two integers without using *, /, %
    public static int divide(int dividend, int divisor) {
        if (divisor == 0) throw new ArithmeticException("Divide by zero");
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE; // clamp overflow

        boolean negative = (dividend < 0) ^ (divisor < 0);
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        int result = 0;

        for (int i = 31; i >= 0; i--) {
            if ((a >> i) >= b) {
                a -= (b << i);
                result += (1 << i);
            }
        }
        return negative ? -result : result;
    }

    public static void main(String[] args) {
        System.out.println(divide(43, -8)); // -5
        System.out.println(divide(-2147483648, 1)); // -2147483648
    }
}
