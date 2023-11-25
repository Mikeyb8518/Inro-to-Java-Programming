import java.util.Scanner;

public class ExecuteProgram {
    public static void main(String[] args) {
        // Prompt the user to enter 4 endpoints
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4");
        double[][] points = getpoints();

        // Calls get arguments to return points a, b, c, d, e, f
        double[] p = getArguments(points);

        // Create a linear equation object
        LinearEquation intersectingPoint = new LinearEquation(p[0], p[1], p[2], p[3], p[4], p[5]);

        // Display results
        if (intersectingPoint.isSolvable()) {
            System.out.println("The intersecting points is at (" + intersectingPoint.getX() + ", " +
                    intersectingPoint.getY());
        }
        else {
            System.out.println("The two lines are parallel");
        }
    }
    // getPoints method to create a 4 x 2 matrix of user endpoints
    public static double[][] getpoints() {
        // Create a scanner input
        Scanner input = new Scanner(System.in);
        // Creates a 4 x 2 matrix
        double[][] points = new double[4][2];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        return points;
    }
    // getArguments method returns the linear equation arguments
    public static double[] getArguments(double[][] points) {
        double[] p = new double[6];

        p[0] = points[0][1] - points[1][1];
        p[1] = -1 * (points[0][0] - points[1][0]);
        p[2] = points[2][1] - points[3][1];
        p[3] = -1 * (points[2][0] - points[3][0]);
        p[4] = (points[0][1] - points[1][1]) * points[0][0] -
                (points[0][0] - points[1][0]) * points[0][1];
        p[5] = (points[2][1] - points[3][1]) * points[2][0] -
                (points[2][0] - points[3][0]) * points[2][1];
        return p;
    }
}
