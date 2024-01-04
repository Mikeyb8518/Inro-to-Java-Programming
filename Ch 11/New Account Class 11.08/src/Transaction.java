import java.util.Date;

public class Transaction {
    // Data Fields
    private java.util.Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    // Constructor
    // Transaction with specified date, type, balance, description
    Transaction(char type, double amount, double balance, String description) {
        date = new java.util.Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    // Methods
    public String getDate() {
        return date.toString();
    }

    // set a new type
    public void setType(char type) {
        this.type = type;
    }

    public char getType() {
        return type;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
