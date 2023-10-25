import java.util.Scanner;

public class LargestRowAndColumn {
    public static void main(String[] args) {
        // Create scanner
        Scanner input = new Scanner(System.in);
        // matrix variable to create a 4-by-4 array
        int[][] matrix = new int[4][4];
        // for loop to initialize 0's and 1's in the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
            }
        }
        // for loop to display the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        // Displays the results by calling the methods
        System.out.println("The largest row index: " + largestRow(matrix));
        System.out.println("The largest column for  index: " + largestColumn(matrix));
    }
    // largestRow method returns the row with the largest row of 1's
    public static int largestRow(int[][] m) {
        int maxRowIndex = 0;
        int max = 0;

        for (int i = 0; i < m.length; i++) {
            int count = 0;
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == 1) {
                    count++;
                }
                if (count > max) {
                    max = count;
                    maxRowIndex = i;
                }
            }
        }
        return maxRowIndex;
    }
    // largestColumn method returns the column with the most 1's
    public static int largestColumn(int[][] m)  {
        int maxColumnIndex = 0;
        int maxCol = 0;

        for (int col = 0; col < m[0].length; col++) {
            int count = 0;
            for (int row = 0; row < m.length; row++) {

                if (m[row][col] == 1) {
                    count++;
                }

                if (count > maxCol) {
                    maxCol = count;
                    maxColumnIndex = col;
                }
            }
        }
        return maxColumnIndex;
    }
}
