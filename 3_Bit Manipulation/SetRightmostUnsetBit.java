import java.util.Scanner;

public class SetRightmostUnsetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int n = sc.nextInt();

        // Set the rightmost unset bit using bitwise OR with (n + 1)
        int result = n | (n + 1);

        System.out.println("Result after setting rightmost unset bit: " + result);

        sc.close();
    }
}
