import java.text.DecimalFormat;

public class ConversionFahrenheitToCelsius {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Celsius\t\tFahrenheit\t\t|\t\tFahrenheit\t\tCelsius");
        System.out.println("-----------------------------------------------------------------");
        double celsius;
        double fahrenheit;
        for (celsius = 40.0, fahrenheit = 120.0; celsius >= 31.0; celsius--, fahrenheit -= 10) {
            System.out.println(celsius + "\t\t" + df.format(celsiusToFahrenheit(celsius)) + "\t\t\t|\t\t" +
                    fahrenheit + "\t\t\t" + df.format(fahrenheitToCelsius(fahrenheit)));
        }
    }

    public static double celsiusToFahrenheit (double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    public  static double fahrenheitToCelsius (double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
