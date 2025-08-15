import java.util.*;

public class PrimeFactorisationUsingSieve {
    // Smallest Prime Factor (SPF) sieve, then factorize in O(log n)
    public static List<Integer> factorize(int n) {
        if (n <= 1) return Collections.emptyList();
        int[] spf = buildSpf(n);
        List<Integer> res = new ArrayList<>();
        while (n > 1) {
            res.add(spf[n]);
            n /= spf[n];
        }
        return res;
    }

    private static int[] buildSpf(int n) {
        int[] spf = new int[n + 1];
        for (int i = 0; i <= n; i++) spf[i] = i;
        for (int i = 2; i * i <= n; i++) {
            if (spf[i] == i) {
                for (int j = i * i; j <= n; j += i) {
                    if (spf[j] == j) spf[j] = i;
                }
            }
        }
        return spf;
    }

    public static void main(String[] args) {
        System.out.println(factorize(84)); // [2, 2, 3, 7]
    }
}
