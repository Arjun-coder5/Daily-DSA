/**
 * Name: Calculate Area Using Switch Case
 * Description: This program calculates the area of a shape based on user input.
 *              It supports Circle (area = π * r²) and Rectangle (area = length * breadth).
 *              The user inputs the shape choice and the required dimensions.
 * Author: Arjun
 * Link: https://www.geeksforgeeks.org/problems/area-of-shapes/
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculateAreaSwitchCase {

    public static double calculateArea(int choice, List<Double> dimensions) {
        switch (choice) {
            case 1:
                double radius = dimensions.get(0);
                return Math.PI * radius * radius;
            case 2:
                double length = dimensions.get(0);
                double breadth = dimensions.get(1);
                return length * breadth;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter choice (1 - Circle, 2 - Rectangle): ");
        int choice = scanner.nextInt();

        List<Double> dimensions = new ArrayList<>();

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                dimensions.add(scanner.nextDouble());
                break;
            case 2:
                System.out.print("Enter length: ");
                dimensions.add(scanner.nextDouble());
                System.out.print("Enter breadth: ");
                dimensions.add(scanner.nextDouble());
                break;
            default:
                System.out.println("Invalid choice.");
                scanner.close();
                return;
        }

        double area = calculateArea(choice, dimensions);
        System.out.printf("Calculated area: %.2f%n", area);

        scanner.close();
    }
}
