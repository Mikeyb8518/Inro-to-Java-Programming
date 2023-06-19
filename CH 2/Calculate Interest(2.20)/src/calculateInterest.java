import java.util.Scanner;

public class calculateInterest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the balance and interest rate (e.g., 3 for 3%): ");
		double balance = input.nextDouble();
		double annualInterest = input.nextDouble();
		
		double interest = balance * (annualInterest / 1200);
		
		System.out.print("The interest is ");
		System.out.printf("%.5f", interest);

	}

}
