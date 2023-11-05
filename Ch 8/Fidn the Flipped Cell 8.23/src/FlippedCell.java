import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class FlippedCell {
    public static void main(String[] args) {
        // Asks user to enter a 6-by-6 matrix
        System.out.println("Enter a 6-by-6 matrix row by row:");

        // getMatrix method calls to get user input for matrix
        int[][] matrix = getMatrix();

        // Find the first row r and first column c where
        // the even number of the 1s property is violated
        int row = oddRow1s(matrix);
        int column = oddCol1s(matrix);

        // find the flipped cell
        if (row < 0 || column < 0) {
            System.out.println("No cell has been flipped");
        }
        else {
            System.out.println("The flipped cell is at (" + row + ", " + column + ")");
        }
    }
    // getMatrix method initializes and returns 6-by-6 matrix with user entry
    public static int[][] getMatrix() {
        Scanner input = new Scanner(System.in);

        int[][] m = new int[6][6];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextInt();
            }
        }
        return m;
    }
    // oddRow1s method returns index of row with odd number of 1s
    public static int oddRow1s(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int count = 0;

            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == 1) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                return i;
            }
        }

        return -1;
    }
    // oddCol1s method returns index of column with odd number of 1s
    public static int oddCol1s(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int count = 0;

            for (int j = 0; j < m.length; j++) {
                if (m[j][i] == 1) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                return i;
            }
        }

        return -1;
    }
}
