import java.util.ArrayList;
import java.util.Scanner;

public class Execute_11_13 {
    // Main Method
    public static void main(String[] args) {
        // Scanner Input
        Scanner input = new Scanner(System.in);
        // Create an ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        // Ask user to input 10 integers
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }

        // Invoke removeDuplicate method
        removeDuplicate(list);

        // Display the results
        System.out.print("The distinct integers are: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
    // removeDuplicate method to remove duplicate integer numbers
    public static void removeDuplicate(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                }
            }
        }
    }
}
