import java.util.Scanner;

public class ColumnSorting {
    public static void main(String[] args) {
        double[][] matrix = getMatrix();

        double[][] sortMatrix = sortColumns(matrix);

        System.out.println("\nColumn sorted array is:");
        for (int i = 0; i < sortMatrix.length; i++) {
            for (int j = 0; j < sortMatrix.length; j++) {
                System.out.print(sortMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    // getMatrix returns and creates a 3-by-3 user input matrix
    public static double[][] getMatrix() {
        Scanner input = new Scanner(System.in);
        double[][] m = new double[3][3];

        System.out.println("Enter a 3-by-3 matrix row by row:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }
        return m;
    }

    // sortColumns method returns a new column sorted array leaving the original intact
    public static double[][] sortColumns(double[][] m) {
        double[][] s = new double[m.length][m[0].length];

        copyMatrix(m, s);

        for (int col = 0; col < s.length; col++) {
            for (int row = 0; row < s.length - 1; row++) {
                double min = s[row][col];
                int index = row;

                for (int j = row + 1; j < s.length; j++) {
                    if (min > s[j][col]) {
                        min = s[j][col];
                        index = j;
                    }
                }
                if (index != row) {
                    s[index][col] = s[row][col];
                    s[row][col] = min;
                }
            }
        }
        return s;
    }
    // copyMatrix method copies all the elements in the original matrix to copy
    public static void copyMatrix(double[][] original, double[][] copy) {
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                copy[i][j] = original[i][j];
            }
        }
    }
}
