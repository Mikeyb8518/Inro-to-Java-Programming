import java.util.Scanner;

public class calculateEnergy {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Amount of Water in Kilograms: ");
		double weight = input.nextDouble();
		
		System.out.print("Enter the initial temperature(in celcius): ");
		double intTemp = input.nextDouble();
		
		System.out.print("Enter the final temperature(in celcius): ");
		double finalTemp = input.nextDouble();
		
		double energy = weight * (finalTemp - intTemp) * 4184;
		
		System.out.println("The energy needed is " + energy);

	}

}
