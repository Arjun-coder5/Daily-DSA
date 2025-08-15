import java.util.*;

public class PrimeFactors {
    public static List<Integer> primeFactors(int n) {
        List<Integer> factors = new ArrayList<>();
        if (n <= 1) return factors;
        while (n % 2 == 0) { factors.add(2); n /= 2; }
        for (int p = 3; p * p <= n; p += 2) {
            while (n % p == 0) { factors.add(p); n /= p; }
        }
        if (n > 1) factors.add(n);
        return factors;
    }

    public static void main(String[] args) {
        System.out.println(primeFactors(84)); // [2, 2, 3, 7]
    }
}
