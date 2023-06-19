import java.util.Scanner;

public class compoundValue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the monthly saving amount: ");
		double savings = input.nextDouble();
		
		int count = 6;
		double total = 0;
		
		double monthlyRate = 0.05 / 12;
		double interestFactor = 1 + monthlyRate;
		
		while (count != 0) {
			total = (total + savings) * interestFactor;
			
			count--;
		}
		
		System.out.print("After the sixth month, the account value is $");
		System.out.printf("%.2f", total);
		System.out.print(" in your saving account after six months");

	}

}
