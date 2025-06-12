
import java.util.*;

public class FactorialNumbers {

    public static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> list = new ArrayList<>();
        generateFactorials(1, 1L, n, list);
        return list;
    }

    private static void generateFactorials(int i, long fact, long n, ArrayList<Long> list) {
        if (fact > n) return;

        list.add(fact);
        generateFactorials(i + 1, fact * (i + 1), n, list);
    }

    public static void main(String[] args) {
        long n = 50; // Change this to test other inputs
        ArrayList<Long> result = factorialNumbers(n);
        System.out.println("Factorial numbers <= " + n + ": " + result);
    }
}