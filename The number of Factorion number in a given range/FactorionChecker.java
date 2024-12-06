
public class FactorionChecker {
    
    public static boolean isFactorion(int num) {
        int sum = 0;
        int temp = num;

        while (temp > 0)
        {
            int digit = temp % 10;
            sum += FactorialCalculator.calculate(digit);
            temp /= 10;
        }

        return sum == num;
    }
}

