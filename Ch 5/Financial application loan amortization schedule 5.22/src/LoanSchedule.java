import java.text.DecimalFormat;
import java.util.Scanner;

public class LoanSchedule {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);

        System.out.println("Loan Amount: ");
        double loan = input.nextDouble();

        System.out.println("Number of Years: ");
        int years = input.nextInt();

        System.out.println("Annual Interest Rate: ");
        double rate = input.nextDouble();

        double monthlyInterest = rate / 1200;
        double monthlyPayment = loan * monthlyInterest / (1 - 1 / Math.pow(1 + monthlyInterest, years * 12));
        double totalPayment = (monthlyPayment * 12) * years;
        double balance = loan, principal, interestTotal;

        System.out.println("\nMonthly Payment: $" + df.format(monthlyPayment));
        System.out.println("Total Payment: $" + df.format(totalPayment));

        System.out.println("\nPayment#\t\tInterest\t\tPrincipal\t\tBalance");

        for (int payment = 1; payment <= years * 12; payment++) {
            interestTotal = monthlyInterest * balance;
            principal = monthlyPayment - interestTotal;
            balance = balance - principal;

            System.out.println(payment + "\t\t\t\t$" + df.format(interestTotal) + "\t\t\t$" + df.format(principal) +
                    "\t\t\t$" + df.format(balance));
        }
    }
}
