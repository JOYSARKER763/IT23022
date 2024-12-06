import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();

        System.out.println("Factorion numbers in the range:");
        for (int i = lowerBound; i <= upperBound; i++) {
            if (FactorionChecker.isFactorion(i)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}

