// Print numbers from N to 1
import java.util.Scanner;

public class PrintNTo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
