public class Execute {
    public static void main(String[] args) {
        // Create a new account with the ID of 1122 and balance of 20,000
        Account account = new Account(1122, 20000);
        // Set annual interest rate to 4.5%
        account.setAnnualInterestRate(4.5);
        // Withdraw 2500 from account
        account.withdraw(2500);
        // Deposit 3000 to account
        account.deposit(3000);
        // Display results
        System.out.println("\n                  Account Statement");
        System.out.println("---------------------------------------------------------");
        System.out.println("Account ID: " + account.getId());
        System.out.println("Date Created: " + account.getDateCreated());
        System.out.printf("Balance: $%.2f\n", account.getBalance());
        System.out.printf("Monthly Interest: $%.2f\n", account.getMonthlyInterest());
    }
}
