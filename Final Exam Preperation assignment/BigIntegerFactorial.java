import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerFactorial {
    // Method to calculate factorial using BigInteger
    public static BigInteger factorial(int num) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 2; i <= num; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        BigInteger result = factorial(num);
        System.out.println(num + "! is \n" + result);
        
        scanner.close();
    }
}

