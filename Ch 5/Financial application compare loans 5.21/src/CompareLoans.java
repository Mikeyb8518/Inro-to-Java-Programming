import java.text.DecimalFormat;
import java.util.Scanner;
public class CompareLoans {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);

        System.out.println("Loan Amount: ");
        double loan = input.nextDouble();

        System.out.println("Number of Years: ");
        double year = input.nextDouble();

        System.out.println("Interest Rates\t\tMonthly Payments\t\tTotal Payments");

        for (double rate = 5.0; rate <= 8; rate += .125) {
            double monthlyInterestRate = rate / 1200;
            double monthlyPayments = loan * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, year * 12));
            double totalPayment = (monthlyPayments * (year * 12));

            System.out.println(rate + "%" + "\t\t\t\t$" + df.format(monthlyPayments) + "\t\t\t\t\t$" + df.format(totalPayment));
        }
    }
}
