public class PrintGFGRecursively {

    public static void main(String[] args) {
        int N = 10; // You can change this value to test
        printGfg(N);
    }

    public static void printGfg(int N) {
        name(1, N);
    }

    public static void name(int i, int n) {
        if (i > n) return;
        System.out.print("GFG ");
        name(i + 1, n);
    }
}
