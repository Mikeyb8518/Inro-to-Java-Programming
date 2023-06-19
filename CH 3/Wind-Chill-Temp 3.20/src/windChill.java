import java.util.Scanner;

public class windChill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
        double fahrenheit = input.nextDouble();

        System.out.println("Enter the wind speed in miles per hour: ");
        double speed = input.nextDouble();

        double windChill = 35.74 + (0.6215 * fahrenheit) - (35.75 * Math.pow(speed, 0.16)) +
                (0.4275 * fahrenheit * Math.pow(speed, 0.16));

        if (speed >= 2) {
            System.out.print("The wind chill index is ");
            System.out.printf("%.5f", windChill);
        } else {
            System.out.println("Please enter a wind speed 2 MPH or higher");
            System.exit(1);
        }
    }
}
