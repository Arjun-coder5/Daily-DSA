
public class RecursiveFibonacci {

    public int fib(int n) {
        return fxn(n);
    }

    public static int fxn(int n) {
        if (n <= 1) return n;
        int last = fxn(n - 1);
        int slast = fxn(n - 2);
        return last + slast;
    }

    // Sample test
    public static void main(String[] args) {
        RecursiveFibonacci sol = new RecursiveFibonacci();
        System.out.println(sol.fib(5));  // Output: 5
        System.out.println(sol.fib(10)); // Output: 55
    }
}
