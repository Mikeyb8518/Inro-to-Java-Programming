public class CheckingAccount extends Account {
    // Data fields
    private double overdraftLimit;

    // Construct a default checking account
    CheckingAccount() {
        super();
        overdraftLimit = -20;
    }

    // Checking account with specified id, balance, overdraftLimit
    CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Mutator methods
    // Set overdraftLimit
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    // return overdraftLimit
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void withdraw(double amount) {
        if (getBalance() - amount > overdraftLimit) {
            setBalance(getBalance() - amount);
        }
        else {
            System.out.println("Error! Amount exceeds overdraft limit");
        }
    }
    // Return a string description of checking class
    public String toString() {
        return super.toString() + "\nOverdraft limit: $" +
                String.format("%.2f", overdraftLimit);
    }
}
