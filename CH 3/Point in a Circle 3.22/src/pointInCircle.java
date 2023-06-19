import java.util.Scanner;

public class pointInCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double distance = Math.sqrt(Math.pow((x2 - 0), 2) + Math.pow((y2 - 0), 2));

        if (distance <= 10) {
            System.out.println("Point (" + x2 + ", " + y2 + ") is in the circle");
        } else {
            System.out.println("Point (" + x2 + ", " + y2 + ") is not in the circle");
        }
    }
}
