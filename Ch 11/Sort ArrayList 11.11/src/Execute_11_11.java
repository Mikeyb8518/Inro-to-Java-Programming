import java.util.ArrayList;
import java.util.Scanner;

public class Execute_11_11 {
    // Create a main method
    public static void main(String[] args) {
        // Create a scanner input
        Scanner input = new Scanner(System.in);

        // Create an ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Asks user to input 5 numbers
        System.out.println("Enter five numbers: ");
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
        // Sort ArrayList
        sort(list);

        // Display results
        System.out.println(list.toString());
    }

    // Sort method
    public static void sort(ArrayList<Integer> list) {
        java.util.Collections.sort(list);
    }
}
