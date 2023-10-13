import java.util.Arrays;
import java.util.Scanner;

public class Sorted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Asks the user to enter the size of the list
        System.out.print("Enter the size of the list: ");
        int[] list = new int[input.nextInt()];
        // Asks the user to enter teh contents of teh list
        System.out.print("Enter the contents of the list: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        // Prints output(calling on Array.toString) to display the array
        System.out.println("\nThe list has " + list.length + " integers: " + Arrays.toString(list));
        // Prints the output calling the isSorted method to see if users input was sorted or not
        System.out.println("The list is " + (isSorted(list) ? "already " : "not ") + "sorted");
    }
    // isSorted method that returns false if the list is not sorted or true otherwise
    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
