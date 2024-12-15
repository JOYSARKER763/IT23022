
import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        System.out.println("The GCD of the given numbers is: " + a);
    }
}

