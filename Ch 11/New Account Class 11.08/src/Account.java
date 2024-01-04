import java.util.ArrayList;
import java.util.Date;

public class Account {
    // Data Fields
    private String name;
    private int id;
    private double balance;
    private static double annualInterest;
    private Date dateCreated;

    private ArrayList<Transaction> transactions;

    // Constructor
    // Create a default account
    Account() {
        name = "";
        id = 0;
        balance = 0;
        annualInterest = 0;
        dateCreated = new Date();
        transactions = new ArrayList<Transaction>();
    }

    // Create an account with specified id and balance
    Account(int id, double balance) {
        name = "";
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
        transactions = new ArrayList<Transaction>();
    }

    // Create an account with specified name, id and balance
    Account(String name, int id, double balance) {
        this(id,balance);
        this.name = name;
    }

    // Mutator methods
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterest(double annualInterest) {
        this.annualInterest = annualInterest;
    }

    // Accessor Methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterest() {
        return annualInterest;
    }

    public String getDateCreated() {
        return dateCreated.toString();
    }

    // Return monthly interest rate
    public double getMonthlyInterestRate() {
        return annualInterest / 12;
    }

    // return monthly interest
    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }

    // Decrease account by specified amount
    public void withdraw(double amount) {
        balance -= amount;
        transactions.add(new Transaction('W', amount, balance,"Withdraw from account"));
    }

    // Increase account by specified amount
    public void deposit(double amount) {
    balance += amount;
    transactions.add(new Transaction('D', amount, balance, "Deposit to account"));
    }

    // Return Transactions
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
}