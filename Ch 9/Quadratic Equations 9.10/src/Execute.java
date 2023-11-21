import java.util.Scanner;

public class Execute {
    public static void main(String[] args) {
        // Scanner input
        Scanner input = new Scanner(System.in);

        // Asks user to enter a, b, c
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // Create a QuadraticEquation object
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        // Compute the real roots of the quadratic equation if any
        System.out.print("The equation has ");
        if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("No real roots");
        } else if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("Two roots " + quadraticEquation.getRoot1() +
                    " and " + quadraticEquation.getRoot2());
        }
        else {
            System.out.println("One root " + (quadraticEquation.getRoot1() > 0 ?
                    quadraticEquation.getRoot1() : quadraticEquation.getRoot2()));
        }
    }
}
