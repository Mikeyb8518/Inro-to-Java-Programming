import java.text.DecimalFormat;

public class ConversionToFeetToMeters {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Feet\t\t\tMeters\t\t\t|\t\t\tMeters\t\t\tFeet");
        System.out.println("------------------------------------------------------------------");
        double feet;
        double meter;

        for (feet = 1.0, meter = 20.0; feet <= 10.0; feet++, meter += 5) {
            System.out.println(feet + "\t\t\t\t" + df.format(feetToMeter(feet)) + "\t\t\t|\t\t\t" +
                    meter + "\t\t\t" + df.format(meterToFeet(meter)));
        }
    }

    public static double feetToMeter(double foot) {
        return 0.305 * foot;
    }

    public static double meterToFeet(double meter) {
        return 3.279 * meter;
    }
}
