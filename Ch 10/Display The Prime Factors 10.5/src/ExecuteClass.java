import java.util.Scanner;

public class ExecuteClass {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a positive number
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();
        if (number < 0) {
            System.out.print("Please enter a positive number");
        }

        // Displays all number's smallest factors in decreasing order
        System.out.print("The smallest factor of " + number + " are: ");
        // Create a StackOfInteger
        StackOfIntegers stack = new StackOfIntegers();

        smallestFactors(number, stack);

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
    // smallestFactors method finds and pushes to StackOfInteger
    public static void smallestFactors(int number, StackOfIntegers stack) {
        int i = 2; // Potential prime number
        while (number / i != 1) {
            if (number % i == 0) {
                stack.push(i);
                number /= i;
            }
            else {
                i++;
            }
        }
        stack.push(number);
    }
}
