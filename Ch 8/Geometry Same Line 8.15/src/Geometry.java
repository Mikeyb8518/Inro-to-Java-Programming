import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initialize points array with 5 rows and 2 columns
        double[][] points = new double[5][2];

        // Asks user to enter 5 points on a line
        System.out.println("Enter five points: ");

        // for loop to get user to enter five points on a line
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        // Prints the result
        System.out.println("The five points are" +
                (sameLine(points) ? " " : " not ") + "on the same line");
    }
    // sameLine method tests whether all the points in an array, returns if on the same line
    public static boolean sameLine(double[][] points) {
        for (int i = 0; i < points.length - 2; i += 3) {
            if (pointPosition(points[i][0], points[i][1], points[i + 1][0], points[i + 1][1],
                    points[i + 2][0], points[i + 2][1]) != 0) {
                return false;
            }
        }
        return true;
    }
    // pointPosition method returns the position of p2 to p0 and p1
    public static double pointPosition(double x0, double y0, double x1, double y1, double x2, double y2) {
        return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
    }
}
