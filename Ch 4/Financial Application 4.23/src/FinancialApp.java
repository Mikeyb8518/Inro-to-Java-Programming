import java.util.Scanner;

public class FinancialApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter employee's name: ");

        String name = input.nextLine();

        System.out.println("Enter number of hours worked in a week: ");

        double hoursWorked = input.nextDouble();

        System.out.println("Enter hourly pay rate: ");

        double payRate = input.nextDouble();

        System.out.println("Enter federal tax withholding rate: ");

        double federalTax = input.nextDouble();

        System.out.println("Enter state tax withholding rate: ");

        double stateTax = input.nextDouble();

        double grossPay = hoursWorked * payRate;

        double fedWithhold = grossPay * federalTax;

        double stateWithhold = grossPay * stateTax;

        double totalDeduction = fedWithhold + stateWithhold;

        double netPay = grossPay - totalDeduction;

        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Pay Rate: $" + payRate);
        System.out.printf("Gross Pay: $%.2f", grossPay);
        System.out.println("\nDeductions:");
        System.out.printf("\tFederal Withholding: $%.2f", fedWithhold);
        //System.out.printf("%.2f", fedWithhold);
        System.out.printf("\n\tState Withholding: $%.2f", stateWithhold);
        //System.out.printf("%.2f", stateWithhold);
        System.out.printf("\n\tTotal Deduction: $%.2f", totalDeduction);
        //System.out.printf("%.2f", totalDeduction);
        System.out.printf("\nNet Pay: $%.2f", netPay);
        //System.out.printf("%.2f", netPay);
    }
}
