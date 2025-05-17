import java.util.Scanner;
class Solution {
    static int multiply(int A, int B) {
        return A * B;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(Solution.multiply(A, B));
        sc.close();
    }
}