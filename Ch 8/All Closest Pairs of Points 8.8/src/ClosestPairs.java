import java.util.Scanner;

public class ClosestPairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Ask user to enter the number of points
        System.out.print("Enter the number of points: ");
        int numOfPoints = input.nextInt();
        // Create an array to store points
        double[][] points = new double[numOfPoints][2];
        System.out.print("Enter " + numOfPoints + " points: ");
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }
        // p1 and p2 are initialized to be the indices in the 'points' array
        int p1 = 0, p2 =1; // Initialize two points
        double shortestDistance = distance(points[p1][0], points[p1][1],
                points[p2][0], points[p2][1]); // Initialize shortestDistance
        // Compute distance for every two points
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = distance(points[i][0], points[i][1],
                        points[j][0], points[j][1]); // Find distance

                if (shortestDistance > distance) {
                    p1 = i; // Update p1
                    p2 = j; // Update p2
                    shortestDistance = distance; // Update shortestDistance
                }
            }
        }
        // Display result
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (distance(points[i][0], points[i][1], points[j][0], points[j][1]) == shortestDistance) {
                    System.out.println("The closest points are: " + "(" + points[i][0] + ", " + points[i][1] +
                            ") and (" + points[j][0] + ", " + points[j][1] + ")");
                }
            }
        }
        System.out.println("The distance is: " + shortestDistance);
    }
    // Compute the distance between two points (x1, y1) and (x2, y2)
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
