public class PrintNTo1 {

    public static void main(String[] args) {
        int N = 10; // you can change this for testing
        printNos(N);
    }

    public static void printNos(int N) {
        reverse(N, N);
    }

    public static void reverse(int i, int n) {
        if (i < 1) return;
        System.out.print(i + " ");
        reverse(i - 1, n);
    }
}
