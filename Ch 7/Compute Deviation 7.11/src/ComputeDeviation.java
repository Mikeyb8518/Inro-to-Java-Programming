import java.text.DecimalFormat;
import java.util.Scanner;

public class ComputeDeviation {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.000");
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        System.out.println("The mean is: " + df.format(mean(numbers)));
        System.out.println("The standard deviation: " + df.format(deviation(numbers)));

    }

    public static double mean(double[] x) {
        double sum = 0.0;

        for (double number: x) {
            sum += number;
        }
        return sum / x.length;
    }

    public static double deviation(double[] x) {
        double deviation = 0;
        double mean = mean(x);

        for (double number: x) {
            deviation += Math.pow(number - mean, 2);
        }
        return Math.sqrt(deviation / (x.length - 1));
    }
}
