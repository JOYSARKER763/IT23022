public class ArraySum {

    // Method to calculate the sum of all elements in an integer array
    public static int calculateSum(int[] arr) {
        int sum = 0;  // Variable to store the sum of array elements

        // Loop through the array and add each element to sum
        for (int num : arr) {
            sum += num;
        }

        return sum;  // Return the calculated sum
    }

    public static void main(String[] args) {
        // Defining an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Calling the calculateSum method and storing the result
        int sum = calculateSum(numbers);

        // Displaying the sum of array elements
        System.out.println("The sum of the array elements is: " + sum);
    }
}

