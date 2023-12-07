import java.util.Date;

public class Account {
    // Data Fields
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    // Constructors
    // Create a default Account class
    Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }
    // Creates an Account class with specified id and initial balance
    Account(int newId, double newBalance) {
        id = newId;
        balance = newBalance;
        dateCreated = new Date();
    }
    // Mutator methods
    // Set id
    public void setId(int newId) {
        id = newId;
    }
    // Set balance
    public void setBalance(double newBalance) {
        balance = newBalance;
    }
    // Set annual interest rate
    public void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }
    // Accessor methods
    // Return id
    public int getId() {
        return id;
    }
    // Return balance
    public double getBalance() {
        return balance;
    }
    // Return annual interest rate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    // Return dateCreated
    public String getDateCreated() {
        return  dateCreated.toString();
    }
    // Methods
    // Return monthly interest rate
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }
    // Return monthly interest
    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }
    // Decrease balance by amount
    public void withdraw(double amount) {
        balance -= amount;
    }
    // Increase balance by amount
    public void deposit(double amount) {
        balance += amount;
    }
}
