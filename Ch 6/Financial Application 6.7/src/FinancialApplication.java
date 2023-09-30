import java.text.DecimalFormat;
import java.util.Scanner;

public class FinancialApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");

        final int NUM_OF_YEARS = 30;

        System.out.println("The amount invested: ");
        double amount = input.nextDouble();

        System.out.println("Annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;

        System.out.println("\nYears\t\tFuture Value");
        for (int years = 1; years <= NUM_OF_YEARS; years++) {
            System.out.println(years + "\t\t\t$" + df.format(futureInvestmentValue(amount, monthlyInterestRate,years)));
        }
    }

    public static double futureInvestmentValue(
            double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}
