import java.util.Scanner;

public class FactorionNumbers {

  
    static int[] factorials = new int[10];

    static {
        for (int i = 0; i < 10; i++) {
            factorials[i] = factorial(i);
        }
    }

    
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

   
    static boolean isFactorion(int number) {
        int originalNumber = number;
        int sumOfFactorials = 0;

        while (number > 0) {
            int digit = number % 10;
            sumOfFactorials += factorials[digit];
            number /= 10;
        }

        return sumOfFactorials == originalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the lower bound: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Enter the upper bound: ");
        int upperBound = scanner.nextInt();

        
        System.out.println("Factorion numbers between " + lowerBound + " and " + upperBound + ":");
        for (int i = lowerBound; i <= upperBound; i++) {
            if (isFactorion(i)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}

