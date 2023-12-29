import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;

    // Constructors
    // Creates a default account
    Account() {
        this(0, 0);
    }
    // Create an Account with specified id and balance
    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    // Mutator Methods
    // Set id
    public void setId(int id) {
        this.id = id;
    }

    // set balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // set annualInterestRate
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // Accessor Methods
    // return Id
    public int getId() {
        return id;
    }

    // return balance
    public double getBalance() {
        return balance;
    }

    // return annualInterestRate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    // Return date created
    public String getDateCreated() {
        return dateCreated.toString();
    }
    /** Return monthly interest rate */
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    // Methods
    /** Return monthly interest */
    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }

    /** Decrease balance by amount */
    public void withdraw(double amount) {
        balance -= amount;
    }

    /** Increase balance by amount */
    public void deposit(double amount) {
        balance += amount;
    }

    /** Return a String decription of Account class */
    public String toString() {
        return "\nAccount ID: " + id + "\nDate created: " + getDateCreated()
                + "\nBalance: $" + String.format("%.2f", balance) +
                "\nMonthly interest: $" + String.format("%.2f", getMonthlyInterest());
    }
}
