import java.util.Scanner;

public class MarkovMatrix {
    public static void main(String[] args) {
        // matrix variable calling getMatrix method to return user input matrix
        double[][] matrix =  getMatrix();

        // Displays output
        System.out.println("it is" + (isMarkovMatrix(matrix) ? " " : " not ") +
                "Markov Matrix");
    }
    // getMatrix method return 3-by-3 matrix with user input
    public static double[][] getMatrix() {
        // create scanner input
        Scanner input = new Scanner(System.in);
        // Create a 3-by-3 matrix
        double[][] m = new double[3][3];
        // Prompts user to enter 3-by-3 matrix with user input
        System.out.println("Enter a 3-by-3 matrix row by row:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }
        return m;
    }
    // isMarkovMatrix method returns true if matrix is a positive and sum is equal to 1
    public static boolean isMarkovMatrix(double[][] m) {
        return isElementPositive(m) && isEachColumnSum1(m);
    }
    // isElementPositive method returns true if elements are positive and false if not
    public static boolean isElementPositive(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] < 0) {
                    return false;
                }
            }
        }
        return true;
    }
    // isEachColumnSum1 method returns true if column sum is equal to 1 and returns false if not
    public static boolean isEachColumnSum1(double[][] m) {
        for (int col = 0; col < m.length; col++) {
            double sum = 0;

            for (int row = 0; row < m.length; row++) {
                sum += m[row][col];
            }
            if (sum != 1) {
                return false;
            }
        }
        return true;
    }
}
