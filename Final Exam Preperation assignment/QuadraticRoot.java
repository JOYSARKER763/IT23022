import java.util.Scanner;

public class QuadraticRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input for coefficients
        System.out.print("Enter coefficients a, b, and c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        
        // Compute discriminant
        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            System.out.println("No real roots.");
        } else {
            // Compute roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            
            // Find the smallest positive root
            double smallestPositiveRoot = Double.MAX_VALUE;

            if (root1 > 0) smallestPositiveRoot = Math.min(smallestPositiveRoot, root1);
            if (root2 > 0) smallestPositiveRoot = Math.min(smallestPositiveRoot, root2);

            if (smallestPositiveRoot == Double.MAX_VALUE) {
                System.out.println("No positive real roots.");
            } else {
                System.out.println("The smallest positive root is: " + smallestPositiveRoot);
            }
        }
        
        scanner.close();
    }
}

