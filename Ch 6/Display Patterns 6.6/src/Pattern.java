import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter number of rows for pattern: ");
        int numOfLines = input.nextInt();
        displayPattern(numOfLines);
    }

    public static void displayPattern(int n) {
        int padding = n - 1;	// Holds number of whitespace
        for (int r = 1; r <= n; r++) {
            // Print padding
            for (int p = 0; p < padding; p++) {
                System.out.print("  ");
            }

            // Print numbers
            for (int i = r; i > 0; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
            padding--; // Decrement padding
        }
    }
}
