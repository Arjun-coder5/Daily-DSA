import java.util.Scanner;

public class User_input_output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apna naam daalein: ");
        String name = sc.nextLine();

        System.out.print("Apni umr daalein: ");
        int age = sc.nextInt();

        System.out.println("Namaste " + name + ", aapki umr " + age + " saal hai.");
        sc.close();
    }
}
