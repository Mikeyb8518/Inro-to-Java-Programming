import java.text.DecimalFormat;
import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {
        //DecimalFormat df = new DecimalFormat("0.000");
        Scanner input = new Scanner(System.in);

        double kilometer = 1.609;

        System.out.print("Please enter how many miles: ");
        double mile = input.nextDouble();

        for (int x = 1; x <= mile; x++) {
            double total = x * kilometer;
            System.out.println("Miles\t\t\t\tKilometers");
            System.out.println(x + "\t\t\t\t\t" + total);
        }
    }
}
