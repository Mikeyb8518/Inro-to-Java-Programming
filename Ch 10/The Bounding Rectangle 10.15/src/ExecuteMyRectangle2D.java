import java.util.Scanner;

public class ExecuteMyRectangle2D {
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);

        double[][] points = new double[5][2];

        // Prompt user to enter 5 points
        System.out.print("\nEnter 5 points: ");
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++){
                points[i][j] = input.nextDouble();
            }
        }
        MyRectangle2D r1 = MyRectangle2D.getRectangle(points);

        System.out.println("The bounding rectangle's center (" + r1.getX() + ", " +
                r1.getY() + "), width " + r1.getWidth() + ", height " + r1.getHeight());
    }
}
