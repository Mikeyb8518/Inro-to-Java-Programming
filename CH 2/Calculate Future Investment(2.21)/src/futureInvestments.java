import java.util.Scanner;

public class futureInvestments {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter investment amount: ");
		double investment = input.nextDouble();
		
		System.out.print("Enter annual interest rate in percentage: ");
		double monthlyInterest = input.nextDouble() / 100;
		
		System.out.print("Enter the number of years: ");
		double years = input.nextDouble();
		
		double futureInvestment = investment * Math.pow((1 + (monthlyInterest / 12)), (years * 12));
		
		System.out.print("Future valus is $");
		System.out.printf("%.2f", futureInvestment);
	}

}
