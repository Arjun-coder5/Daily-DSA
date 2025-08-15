import java.util.*;

public class SieveOfEratosthenes {
    public static List<Integer> sieve(int n) {
        if (n < 2) return Collections.emptyList();
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) isPrime[i] = false;
            }
        }
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) if (isPrime[i]) primes.add(i);
        return primes;
    }

    public static void main(String[] args) {
        System.out.println(sieve(50)); // primes up to 50
    }
}
