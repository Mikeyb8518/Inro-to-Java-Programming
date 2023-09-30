import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter number of rows: ");
        int numOfLines = input.nextInt();

        System.out.println("Pattern A");

        for (int row = 1; row <= numOfLines; row++) {
            for (int j = 1; j <= row; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("\nPattern B");

        for (int rowB = numOfLines; rowB >= 1; rowB--) {
            for (int k = 1; k <= rowB; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        System.out.println("\nPattern C");

        for (int rowC = 1; rowC <= numOfLines; rowC++) {
            for (int l = numOfLines - rowC; l >= 1; l--) {
                System.out.print("  ");
            }
            for (int m = rowC; m >= 1; m--) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

        System.out.println("\nPattern D");
        for (int rowD = numOfLines; rowD >= 1; rowD--) {
            for (int n = numOfLines; n > rowD; n--) {
                System.out.print("  ");
            }
            for (int o = 1; o <= rowD; o++) {
                System.out.print(o + " ");
            }
            System.out.println();
        }
    }
}
