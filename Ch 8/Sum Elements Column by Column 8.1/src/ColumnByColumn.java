import java.util.Scanner;

public class ColumnByColumn {
    public static void main(String[] args) {
        // Reads a 3-4 matrix
        double[][] matrix = getMatrix();
        // Displays the sum of the column
        for (int column = 0; column < matrix[0].length; column++) {
            System.out.println("Sum of the elements at column " + column + " is " + sumColumn(matrix, column));
        }
    }
    // getMatrix method initializes an array with user input
    public static double[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        final int ROW = 3;
        final int COLUMN = 4;
        double[][] m = new double[ROW][COLUMN];
        // Prompts user to enter a 3-by-4 matrix
        System.out.println("Enter a " + ROW + "-by-" + COLUMN + " matrix by row: ");

        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[row].length; column++) {
                m[row][column] = input.nextDouble();
            }
        }
        return m;
    }
    // sumColumn method gets and returns the sum of each column in the columnIndex
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int row = 0; row < m.length; row++) {
            sum += m[row][columnIndex];
        }
        return sum;
    }
}
