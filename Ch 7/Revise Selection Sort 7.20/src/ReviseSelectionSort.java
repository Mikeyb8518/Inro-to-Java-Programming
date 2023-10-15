import java.util.Scanner;

public class ReviseSelectionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10]; // Creates an array with a length of 10
        // Asks user to input 10 double numbers to sort
        System.out.print("Enter 10 double numbers to sort: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        // Calls SelectionSort method
        SelectionSort(numbers);
        // Displays the sorted numbers
        for (double e : numbers) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
    /*SelectionSort method that finds the largest number and replaces it with the last
    * "Accending order" */
    public static void SelectionSort(double[] list) {
        for (int i = list.length - 1; i >= 0; i--) {
            // Find the maximum in the list
            double currentMax = list[i];
            int currentMaxIndex = i;

            for (int j = i - 1; j >= 0; j--) {
                if (currentMax < list[j]) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }
            // Swap list[i] with list[currentMaxIndex] if necessary
            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }
}
