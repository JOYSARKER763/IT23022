import java.io.*;
import java.util.*;

public class NumberProcessor {
    public static void main(String[] args) {
        try {
            // 1. ইনপুট ফাইল থেকে পড়া
            File inputFile = new File("input.txt");
            Scanner scanner = new Scanner(inputFile);
            scanner.useDelimiter(","); // কমা দিয়ে সংখ্যা আলাদা করা

            int maxNumber = Integer.MIN_VALUE;

            // 2. সংখ্যা পড়া ও সর্বোচ্চ সংখ্যা বের করা
            while (scanner.hasNext()) {
                int num = Integer.parseInt(scanner.next().trim());
                if (num > maxNumber) {
                    maxNumber = num;
                }
            }
            scanner.close();

            // 3. প্রাকৃতিক সংখ্যার যোগফল নির্ণয়
            int sumOfNaturalNumbers = (maxNumber * (maxNumber + 1)) / 2;

            // 4. আউটপুট ফাইলে লেখা
            File outputFile = new File("output.txt");
            PrintWriter writer = new PrintWriter(outputFile);
            writer.println(maxNumber + ", " + sumOfNaturalNumbers);
            writer.close();

            System.out.println("ফলাফল output.txt ফাইলে লেখা হয়েছে!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

