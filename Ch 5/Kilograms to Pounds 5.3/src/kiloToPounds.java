import java.text.DecimalFormat;
import java.util.Scanner;

public class kiloToPounds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.0");

        double kilograms = 1;
        double pounds = 2.2;
        int count = 1;

        while (count <= 200) {
            double total = kilograms * pounds;
            System.out.println("Kilograms\t\t\tPounds");
            System.out.println(count + "\t\t\t\t\t" + df.format(total));
            kilograms++;
            count++;
        }
    }
}
