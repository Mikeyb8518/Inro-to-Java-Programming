import java.util.Scanner;

public class EliminateDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Array of numbers to hold 10 values
        int[] numbers = new int[10];
        // Asks the user to input 10 numbers
        System.out.print("Please enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        // array of distinctNumbers calling the eliminateDuplicates method
        int[] distinctNumbers = eliminateDuplicates(numbers);
        // Prints out the distinct numbers
        System.out.print("The distinct numbers are: ");
        for (int e : distinctNumbers) {
            if (e > 0) {
                System.out.print(" " + e);
            }
        }
        System.out.println();
    }
    // Method to eliminate duplicates from array
    public static int[] eliminateDuplicates(int[] list) {
        int[] distinctList = new int[list.length];
        int i = 0;	// index distinctList
        for (int e: list) {
            if (linearSearch(distinctList, e) == -1) {
                distinctList[i] = e;
                i++;
            }
        }
        return distinctList;
    }
    // linearSearch Method
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i])
                return i;
        }
        return -1;
    }
}
