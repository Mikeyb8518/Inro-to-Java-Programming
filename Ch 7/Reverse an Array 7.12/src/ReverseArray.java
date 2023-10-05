import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        // Asks user to input 10 numbers to reverse
        System.out.print("Enter 10 numbers to reverse: ");
        for (int i = 0; i  < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        // Calls reverse method
        reverse(numbers);

        System.out.print("The reverse is: ");
        // Prints out the reverse input from user
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
    // Reverse Method that is void and reverses the user input of 10 numbers
    public static void reverse(int[] array) {
        int temp;
        for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
