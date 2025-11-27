import java.util.Scanner;

public class Task3_3 {
    public static void main(String[] args) {
        double a, b, c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of a");
        a = scanner.nextDouble();

        System.out.println("Enter the value of b");
        b = scanner.nextDouble();

        System.out.println("Enter the value of c");
        c = scanner.nextDouble();

        scanner.close();

        if (a == 0) {
            System.out.println("The value of a cannot be zero.");
        } else {
            double delta = b*b - 4*a*c;

            if (delta < 0) {
                System.out.println("No real roots exist.");
            } else if (delta == 0) {
                double root = -b / (2*a);
                System.out.println("One real root exists: " + root);
            } else {
                double root1 = (-b + Math.sqrt(delta)) / (2*a);
                double root2 = (-b - Math.sqrt(delta)) / (2*a);
                System.out.println("Two real roots exist: " + root1 + " and " + root2);
            }
        }
    }
}
