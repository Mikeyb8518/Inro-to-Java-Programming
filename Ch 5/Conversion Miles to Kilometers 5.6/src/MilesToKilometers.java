import java.text.DecimalFormat;

public class MilesToKilometers {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.000");
        final double KILOMETER = 1.609;

        System.out.print("Miles\t\tKilometers\t|\tKilometers\t\tMiles\n");

        for (int m = 1, k = 20; m <= 10 && k <= 65; m++, k += 5) {
            System.out.println(m + "\t\t\t" + df.format(m * KILOMETER) + "\t\t|\t" +
                    k + "\t\t\t\t" + df.format(k / KILOMETER));
        }
    }
}
