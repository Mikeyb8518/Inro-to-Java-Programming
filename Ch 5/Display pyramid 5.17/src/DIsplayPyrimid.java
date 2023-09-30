import java.util.Scanner;

public class DIsplayPyrimid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of lines: ");
        int numOfLines = input.nextInt();

        for (int row = 1; row <= numOfLines; row++) {
            // Create Spaces
            for (int s = numOfLines - row; s >= 1; s--) {
                System.out.print("  ");
            }
            // Decrease number in each row
            for (int l = row; l >= 2; l--) {
                System.out.print(l + " ");
            }
            // Increase number in each row
            for (int r = 1; r <= row; r++) {
                System.out.print(r + " ");
            }
            // End line
            System.out.println();
        }
    }
}
