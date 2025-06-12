import java.util.Scanner;

public class PrintNumbersRecursively {
    public void printNos(int n) {
        printRecursive(1, n);
    }

    public static void printRecursive(int i, int n) {
        if (i > n) return;
        System.out.print(i + " ");
        printRecursive(i + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintNumbersRecursively obj = new PrintNumbersRecursively();
        obj.printNos(n);
        sc.close();
    }
}
