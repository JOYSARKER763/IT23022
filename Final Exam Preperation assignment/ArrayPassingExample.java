public class ArrayPassingExample {
    // Method to calculate sum of elements in an array
    public static int sumArray(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Define an array
        int sum = sumArray(arr); // Passing array to the method
        System.out.println("Sum of array elements: " + sum);
    }
}

