import java.util.Scanner;

public class intersectingPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter 4 coordinates x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        double a, b, c, d, e, f;

        a = (y1 - y2);
        b = (x1 - x2);
        c = (y3 - y4);
        d = (x3 - x4);
        e = (a * x1) - (b * y1);
        f = (c * x3) - (d * y3);

        double linear = a * d - b * c;

        if (a * d - b * c == 0) {
            System.out.println("The two lines are parallel");
        } else {
            double x = (e * d - b * f) / linear;
            double y = -((a * f) - (e * c)) / linear;

            System.out.println("The intersecting point is at (" + x + ", " + y + ")");
        }
    }
}
