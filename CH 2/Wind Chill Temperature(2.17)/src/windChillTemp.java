import java.util.Scanner;

public class windChillTemp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
		double temp =  input.nextDouble();
		
		if (temp > 41 || temp < -58) {
			System.out.print("Please enter a valid temperature between -58F and 41F");
		}
		
		System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
		double windSpeed = input.nextDouble();
		
		if (windSpeed < 2) {
			System.out.print("Please enter a wind speed (>=2) miles per hour");
		}
		
		double windChill = 35.74 + (0.6215 * temp) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * (temp) * (Math.pow(windSpeed, 0.16)));
		
		System.out.print("The wind chill index is: ");
		System.out.printf("%.5f", windChill);

	}

}
