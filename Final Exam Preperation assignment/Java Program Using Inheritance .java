
class BaseClass {
    void printResult(String message) {
        System.out.println(message);
    }
}


class SumClass extends BaseClass {
    double computeSum() {
        double sum = 0;
        for (double i = 1.0; i >= 0.1; i -= 0.1) {
            sum += i;
        }
        return sum;
    }
}


class DivisorMultipleClass extends BaseClass {
    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}


class NumberConversionClass extends BaseClass {
    void convert(int num) {
        System.out.println("Binary: " + Integer.toBinaryString(num));
        System.out.println("Octal: " + Integer.toOctalString(num));
        System.out.println("Hexadecimal: " + Integer.toHexString(num));
    }
}


class CustomPrintClass extends BaseClass {
    void pr(String message) {
        System.out.println("*** " + message + " ***");
    }
}


public class MainClass {
    public static void main(String[] args) {
        SumClass sumObj = new SumClass();
        DivisorMultipleClass gcdLcmObj = new DivisorMultipleClass();
        NumberConversionClass convObj = new NumberConversionClass();
        CustomPrintClass printObj = new CustomPrintClass();

        printObj.pr("Sum of series: " + sumObj.computeSum());
        printObj.pr("GCD of 24 and 36: " + gcdLcmObj.gcd(24, 36));
        printObj.pr("LCM of 24 and 36: " + gcdLcmObj.lcm(24, 36));

        convObj.convert(25);
    }
}

