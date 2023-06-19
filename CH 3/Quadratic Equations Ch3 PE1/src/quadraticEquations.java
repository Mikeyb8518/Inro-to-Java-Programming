import java.util.Scanner;

public class quadraticEquations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = b * b - 4.0 * a * c;

        if (discriminant > 0.0) {

            double root1 = (-b + Math.pow(discriminant, 0.5)) / (2.0 * a);
            double root2 = (-b - Math.pow(discriminant, 0.5)) / (2.0 * a);
            System.out.println("The roots are: " + root1 + " and " + root2);
        }
        else if (discriminant == 0.0) {

            double root1 = -b / (2.0 * a);
            System.out.println( "The root is: " + root1);
        }
        else {
            System.out.println("The equation has no real roots");
        }
    }
}
