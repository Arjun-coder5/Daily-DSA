import java.util.*;

public class AllDivisors {
    public static List<Integer> allDivisors(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                res.add(i);
                if (i != n / i) res.add(n / i);
            }
        }
        Collections.sort(res);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(allDivisors(28)); // [1, 2, 4, 7, 14, 28]
    }
}
