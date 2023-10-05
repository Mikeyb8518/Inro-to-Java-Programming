import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];
        // Asks user to input 10 double numbers
        System.out.print("Enter 10 numbers: ");
        // For loop to read and input the array length
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        System.out.println("The smallest number is: " + min(numbers));
    }
    // Method to find the smallest number in array
    public static double min(double[] array) {
        double small = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < small) {
                small = array[i];
            }
        }
        return small;
    }
}
