import java.util.Scanner;

public class AddMatrices {
    public static void main(String[] args) {
        // matrix1 and matrix2 variables that call getMatrix method
        double[][] matrix1 = getMatrix(1);
        double[][] matrix2 = getMatrix(2);
        // matrix3 variable call the addMatrix method to add matrix1 and matrix2 together
        double[][] matrix3 = addMatrix(matrix1, matrix2);
        // print method prints the end result displaying the result
        print(matrix1, matrix2, matrix3);
    }
    // getMatrix method asks for user input and returns m(numbers entered)
    public static double[][] getMatrix(int n) {
        // Creates a scanner
        Scanner input = new Scanner(System.in);
        // prompts user to enter a 3-by-3 matrix
        System.out.print("Enter matrix" + n + ": ");

        double[][] m = new double[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = input.nextDouble();
            }
        }
        return m;
    }
    // addMatrix method adds one matrix to the other and returns c(total)
    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] c = new double[3][3];

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }
    // print displays all elements in row r
    public static void print(double[][] m , int r) {
        for (int j = 0; j < m[r].length; j++) {
            System.out.print(m[r][j] + " ");
        }
    }
    // print displays the results
    public static void print(double[][] m1, double[][] m2, double[][] m3) {
        System.out.println("The matrices are added as follows: ");

        for (int i = 0; i < 3; i++) {
            print(m1, i);
            System.out.print((i == 1 ? "  +  " : "     "));
            print(m2, i);
            System.out.print((i == 1 ? "  =  " : "     "));
            print(m3, i);
            System.out.println();
        }
    }
}
