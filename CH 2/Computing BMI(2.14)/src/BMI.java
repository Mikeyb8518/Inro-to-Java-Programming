import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds: ");
		double pounds = input.nextDouble();
		
		double kilograms = pounds * 0.45359237;
		
		System.out.print("Enter your height in inches: ");
		double height = input.nextDouble();
		
		double meters = height * 0.0254;
		
		double BMI = kilograms / (Math.pow(meters, 2));
		
		System.out.print("BMI is ");
		System.out.printf("%.4f", BMI);

	}

}
