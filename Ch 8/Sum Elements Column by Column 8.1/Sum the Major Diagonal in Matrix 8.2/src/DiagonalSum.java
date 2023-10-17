import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        //Reads a 4-by-4 matrix
        double[][] matrix = getMatrix();
        //Display the sum of the diagonal column
        System.out.println("The sum of the elements in the major diagonal is "
        + sumMajorDiagonal(matrix));

    }
    /* getMatrix method that returns the users input in
    * the 4-by-4 matrix */
    public static double[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        final int ROW = 4;
        final int COLUMN = 4;
        double[][] m = new double[ROW][COLUMN];

        System.out.println("Enter a 4-by-4 matrix by row: ");
        for (int row = 0; row < ROW; row++) {
            for (int col = 0; col < COLUMN; col++) {
                m[row][col] = input.nextDouble();
            }
        }
        return m;
    }
    // sumMajorDiagonal method returns the sum of the major diagonal in the matrix
    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;
    }

}
