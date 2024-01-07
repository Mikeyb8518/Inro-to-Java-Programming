import java.util.Scanner;

public class Execute_11_10 {
    public static void main(String[] args) {
        // Create scanner
        Scanner input = new Scanner(System.in);
        // Create a Stack
        Stack stack = new Stack();
        // Ask user to enter 5 strings
        System.out.println("Enter Five String: ");
        for (int i = 0; i < 5; i++) {
            stack.push(input.next());
        }
        // Return a stack in reverse order
        System.out.println("Stack: " + stack.toString());
    }
}
