import java.util.Scanner;

public class costOfDriving {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the driving distance: ");
		double distance = input.nextDouble();
		
		System.out.print("Enter miles per gallon: ");
		double gallons = input.nextDouble();
		
		System.out.print("Enter the price per gallon: ");
		double price = input.nextDouble();
		
		double cost = (distance / gallons) * price;
		
		System.out.print("The cost of driving is $");
		System.out.printf("%.2f", cost);

	}

}
