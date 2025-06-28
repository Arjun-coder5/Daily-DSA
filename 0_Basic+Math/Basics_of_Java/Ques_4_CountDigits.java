import java.util.Scanner;

public class Ques_4_CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;
        int temp = n;

        if (n == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                count++;
                temp /= 10;
            }
        }

        System.out.println("Number of digits: " + count);
        sc.close();
    }
}
