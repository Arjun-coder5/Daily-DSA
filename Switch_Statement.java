import java.util.*;

public class Switch_Statement {
    static double switchCase(int choice, List<Double> arr) {
        switch (choice) {
            case 1: // Area of Circle
                double r = arr.get(0);
                return Math.PI * r * r;
            case 2: // Area of Rectangle
                double l = arr.get(0);
                double b = arr.get(1);
                return l * b;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> values = new ArrayList<>();

        System.out.println("Enter 1 for Circle area or 2 for Rectangle area:");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter radius: ");
            values.add(sc.nextDouble());
        } else if (choice == 2) {
            System.out.print("Enter length: ");
            values.add(sc.nextDouble());
            System.out.print("Enter breadth: ");
            values.add(sc.nextDouble());
        } else {
            System.out.println("Invalid choice");
            return;
        }

        double area = switchCase(choice, values);
        System.out.println("Area is: " + area);
    }
}
