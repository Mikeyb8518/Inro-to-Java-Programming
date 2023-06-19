import java.util.Scanner;

public class linearEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        double divisor = (a * d - b * c);
        double x = (e * d - b * f) / divisor;
        double y = (a * f - e * c) / divisor;

        if (divisor == 0) {
            System.out.println("The equation has no solution");
            System.exit(0);
        }
        else {
            System.out.println("X is: " + x + " and " + "y is: " + y);
        }
    }
}
