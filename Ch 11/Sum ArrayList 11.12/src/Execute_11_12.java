import java.util.ArrayList;
import java.util.Scanner;

public class Execute_11_12 {
    // Create main Method
    public static void main(String[] args) {
        // Create scanner input
        Scanner input = new Scanner(System.in);

        // Create ArrayList<double>
        ArrayList<Double> list = new ArrayList<Double>();

        // Ask user to input 5 numbers
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            list.add(input.nextDouble());
        }

        // Display results
        System.out.println("The sum of the 5 numbers is: " + sum(list));
    }
    // Sum method for ArrayList<Double>
    public static double sum(ArrayList<Double> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
