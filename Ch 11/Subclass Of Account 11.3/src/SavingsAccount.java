public class SavingsAccount extends Account {

    // Construct a default savings account
    public SavingsAccount() {
        super();
    }
    // SavingsAccount with specified id and balance
    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    // Decrease balance by amount
    public void withdraw(double amount) {
        if (amount < getBalance()) {
            setBalance(getBalance() - amount);
        }
        else {
            System.out.println("Error! Saving account overdrawn transaction rejected!");
        }
    }
}
