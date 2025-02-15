import java.io.*;
import java.util.*;

public class NumberProcessor {
    public static void main(String[] args) {
        try {
            
            File inputFile = new File("input.txt");
            Scanner scanner = new Scanner(inputFile);
            scanner.useDelimiter(","); 

            int maxNumber = Integer.MIN_VALUE;

           
            while (scanner.hasNext()) {
                int num = Integer.parseInt(scanner.next().trim());
                if (num > maxNumber) {
                    maxNumber = num;
                }
            }
            scanner.close();

           
            int sumOfNaturalNumbers = (maxNumber * (maxNumber + 1)) / 2;

            
            File outputFile = new File("output.txt");
            PrintWriter writer = new PrintWriter(outputFile);
            writer.println(maxNumber + ", " + sumOfNaturalNumbers);
            writer.close();

            System.out.println("result output.txt has been written");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

