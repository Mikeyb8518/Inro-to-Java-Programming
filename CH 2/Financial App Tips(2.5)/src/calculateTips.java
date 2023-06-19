import java.util.Scanner;

public class calculateTips {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the subtotal and gratuity rate: ");
		
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();
		
		double gratTotal = subtotal * (gratuityRate / 100);
		double total = subtotal + gratTotal;
		
		System.out.println("The gratuity is $" + gratTotal + " and total is $" + total);
	}

}
