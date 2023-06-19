import java.util.Scanner;

public class shippingCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter Weight of Package: ");

        double weight = input.nextDouble();

        double cost = 0;

        if (weight < 0) {
            System.out.println("The Package Cannot Be Shipped");
        } else if (weight <= 1) {
            cost = 3.50;
            System.out.print("The shipping cost will be: $");
            System.out.printf("%.2f", cost);
        } else if (weight <= 3) {
            cost = 5.50;
            System.out.print("The shipping cost will be: $");
            System.out.printf("%.2f", cost);
        } else if (weight <= 10) {
            cost = 8.50;
            System.out.print("The shipping cost will be: $");
            System.out.printf("%.2f", cost);
        } else if (weight <= 20) {
            cost = 10.50;
            System.out.print("The shipping cost will be: $");
            System.out.printf("%.2f", cost);
        } else if (weight > 20) {
            System.out.println("The Package Cannot Be Shipped");
        }
    }
}
