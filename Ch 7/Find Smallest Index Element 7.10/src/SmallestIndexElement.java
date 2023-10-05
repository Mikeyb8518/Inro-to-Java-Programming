import java.util.Scanner;

public class SmallestIndexElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] num = new double[10];
        // Asks user to input 10 numbers
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();
        }
        // Prints output with the result of the smallest index
        System.out.println("The smallest number is at index: " + indexOfSmallestElement(num));
    }
    // Method to find the smallest index element
    public static int indexOfSmallestElement(double[] array) {
        if (array.length <= 1) {
            return 0;
        }

        double small = array[0];
        int indexSmallest = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < small) {
                small = array[i];
                indexSmallest  = i;
            }
        }
        return indexSmallest;
    }
}
