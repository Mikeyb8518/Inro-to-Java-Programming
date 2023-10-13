import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Array of double numbers that holds 10 values
        double[] numbers = new double[10];
        // Asks user to enter 10 double numbers
        System.out.print("Please enter 10 double numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        // Calls method
        bubbleSort(numbers);
        // Prints out the result of the sorted array
        for (double e : numbers) {
            System.out.println(e + " ");
        }

        System.out.println();
    }
    // bubbleSort method that takes the double array list and sorts it
    public static void bubbleSort(double[] list) {
        double temp;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 0; i < list.length - 1; i++) {
                // if the list is not in order swaps it
                if (list[i] > list[i + 1]) {
                    temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped); // Repeats if a value was swapped
    }
}
