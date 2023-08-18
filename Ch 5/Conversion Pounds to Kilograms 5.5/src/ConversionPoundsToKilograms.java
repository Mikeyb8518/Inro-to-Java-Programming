import java.text.DecimalFormat;

public class ConversionPoundsToKilograms {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        double pound = 2.2;

        System.out.print("Kilograms\tPounds\t\t|\tPounds\t\tKilograms\n");

        for (int kilo = 1, lb = 20; kilo <= 199 && lb <= 515; kilo += 2, lb += 5) {
            System.out.println(kilo + "\t\t\t" + df.format(kilo * pound) + "\t\t|\t" +
                    lb + "\t\t\t" + df.format(lb / pound));
        }

    }
}
