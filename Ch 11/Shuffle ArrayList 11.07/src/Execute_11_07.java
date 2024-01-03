import java.util.ArrayList;
import java.util.Scanner;

public class Execute_11_07 {
    // main method
    public static void main(String[] args) {
        // Create Scanner input
        Scanner input = new Scanner(System.in);

        // Create an ArrayList of integer type
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Prompt user to enter a list of integers end it with 0
        System.out.println("Enter a list of Integers ending with 0: ");
        Integer number = input.nextInt();

        while (number.intValue() != 0) {
            list.add(number);
            number = input.nextInt();
        }

        // Invoke Shuffle Method
        shuffle(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    // Shuffle Method
    public static void shuffle(ArrayList<Integer> list) {
        java.util.Collections.shuffle(list);
    }
}
