import java.util.ArrayList;
import java.util.Scanner;

public class Execute_11_14 {
    // Main Method
    public static void main(String[] args) {
        // Scanner input
        Scanner input = new Scanner(System.in);
        // Create ArrayList list1 and list2
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        // Asks  user to enter two lists with 5 integers
        System.out.print("Enter 5 numbers for list1: ");
        fill(list1);
        System.out.print("Enter 5 numbers for list2: ");
        fill(list2);

        ArrayList<Integer> list3 = union(list1, list2);

        // Display combined list
        System.out.print("The combine list is: ");
        for (int i = 0; i < list3.size(); i++) {
            System.out.print(list3.get(i) + " ");
        }
        System.out.println();
    }

    // Returns the union of list1 and list2
    public static ArrayList<Integer> union(ArrayList<Integer> list1,
                                           ArrayList<Integer> list2) {
        ArrayList<Integer> list3 = list1;
        for (int i = 0; i < list2.size(); i++) {
            list3.add(list2.get(i));
        }
        return list3;
    }

    // fill method to fill the user input with 10 integer numbers
    public static void fill(ArrayList<Integer> list) {
        // Scanner input
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
    }
}